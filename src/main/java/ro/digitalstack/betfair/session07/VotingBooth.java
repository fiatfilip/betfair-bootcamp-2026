package ro.digitalstack.betfair.session07;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class VotingBooth {
    private final List<Vote> votes = new Vector<>();
    private final List<UUID> ids = new Vector<>();

    public void castVote(Vote vote, UUID voterId) {
        if(ids.contains(voterId))
        {
            return;
        }
        votes.add(vote);
        ids.add(voterId);

      // System.out.println("Id: " + voterId + " Vote: " + vote);
//        System.out.println(String.format("Id: %s Vote: %s", voterId, vote.getElectedCandidate()));
    }

    public HashMap<Candidate, Integer> getVotes() {
        HashMap<Candidate, Integer> votesResults = new HashMap<>();
        for(Vote vote : votes)
        {
            if(votesResults.containsKey(vote.getElectedCandidate()))
            {
                votesResults.put(vote.getElectedCandidate(), votesResults.get(vote.getElectedCandidate()) + 1);
            }
            else
            {
                votesResults.put(vote.getElectedCandidate(), 1);
            }
        }

        return votesResults;
    }
}
