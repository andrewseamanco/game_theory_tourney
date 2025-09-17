import java.util.List;

public class TitForTat extends Player {
    public TitForTat() {
        this.name = "TitForTat";
    }

    Decision takeTurn(int position, List<Turn> turns, int round, int endRound) {
        if (turns.isEmpty()) {
            return Decision.COOPERATE;
        } else {
            int opponentPosition = position == 0 ? 1 : 0;
            if (opponentPosition == 0) {
                return turns.get(round - 1).getPlayerOneDecision();
            } else {
                return turns.get(round - 1).getPlayerTwoDecision();
            }
        }
    }
}