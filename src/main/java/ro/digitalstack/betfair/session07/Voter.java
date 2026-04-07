package ro.digitalstack.betfair.session07;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class Voter implements Callable<Vote> {
    private UUID id;
    private VotingBooth votingBooth;

    public Voter(VotingBooth votingBooth) {
        this.id = UUID.randomUUID();
        this.votingBooth = votingBooth;
    }

    @Override
    public Vote call() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        try{
            sleep(random.nextInt(10) * 1000);
        }
        catch (InterruptedException e){}
        return castVote();

    }

    private Vote castVote() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int index = random.nextInt(Candidate.values().length);

        Candidate votedCandidate = Candidate.values()[index];
        Vote vote = new Vote(votedCandidate);

        votingBooth.castVote(vote, id);

        return vote;
    }
}
