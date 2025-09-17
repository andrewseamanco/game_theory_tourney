public class Turn {
    Decision playerOneDecision;
    Decision playerTwoDecision;

    public Turn(Decision pod, Decision ptd) {
        this.playerOneDecision = pod;
        this.playerTwoDecision = ptd;
    }

    public Decision getPlayerOneDecision() {
        return this.playerOneDecision;
    }

    public Decision getPlayerTwoDecision() {
        return this.playerTwoDecision;
    }
}