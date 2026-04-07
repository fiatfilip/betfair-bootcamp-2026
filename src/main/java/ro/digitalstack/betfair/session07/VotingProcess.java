package ro.digitalstack.betfair.session07;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class VotingProcess {

    static final int NO_OF_THREADS = 16;
    static final int NO_OF_VOTERS = 100;


    public static void main(String[] args) throws Exception {
        VotingBooth booth = new VotingBooth();

        ExitPoll exitPoll = new ExitPoll(booth);
        exitPoll.setDaemon(true);
        exitPoll.start();

        ExecutorService votingExecutorService = Executors.newFixedThreadPool(NO_OF_THREADS);

        List<Callable<Vote>> votingFutures = new ArrayList<>();
        for (int i = 0; i < NO_OF_VOTERS; i++) {
            votingFutures.add(new Voter(booth));
        }

        List<Future<Vote>> results = votingExecutorService.invokeAll(votingFutures, 60, TimeUnit.SECONDS);


        for (Future<Vote> result : results) {
            if (result.isCancelled()) {
                //
            } else {
                Vote vote = result.get();
            }
        }

        votingExecutorService.shutdown();
        System.out.println("Final results: ");
        finalResults(booth);

    }

    public static void finalResults(VotingBooth votingBooth) {
        System.out.println("***************************");
        for(Candidate candidate : votingBooth.getVotes().keySet())
        {
            System.out.println(String.format("Candidate: %s %d votes", candidate.name(),
                    votingBooth.getVotes().get(candidate)));

        }
        System.out.println("***************************");
    }
}
