package ro.digitalstack.betfair.session07;

public class Vote {
    private final Candidate electedCandidate;
    public Vote(Candidate electedCandidate) {
        this.electedCandidate = electedCandidate;
    }
    public Candidate getElectedCandidate() {
        return electedCandidate;
    }
}
