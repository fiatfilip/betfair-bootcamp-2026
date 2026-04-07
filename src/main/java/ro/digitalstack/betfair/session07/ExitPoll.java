package ro.digitalstack.betfair.session07;

public class ExitPoll extends Thread {
    private VotingBooth votingBooth;

    public ExitPoll(VotingBooth votingBooth) {
        this.votingBooth = votingBooth;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {}

            System.out.println("***************************");
            for(Candidate candidate : votingBooth.getVotes().keySet())
            {
                System.out.println(String.format("Candidate: %s %d votes", candidate.name(),
                        votingBooth.getVotes().get(candidate)));

            }
            System.out.println("***************************");

        }
    }
}
