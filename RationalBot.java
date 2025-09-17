import java.util.List;

public class RationalBot extends Player {
   public RationalBot() {
        this.name = "Rational Bot";
    }

    Decision takeTurn(int position, List<Turn> turns, int round, int endRound) {
        if (turns.size() < 2) {
            return Decision.COOPERATE;
        }
        if (position == 0) {
            if (turns.get(turns.size()-1).getPlayerTwoDecision() == Decision.BETRAY 
                && turns.get(turns.size()-2).getPlayerTwoDecision() == Decision.BETRAY) {
                return Decision.BETRAY;
            } else {
                return Decision.COOPERATE;
            }
        } else {
            if (turns.get(turns.size()-1).getPlayerOneDecision() == Decision.BETRAY 
                && turns.get(turns.size()-2).getPlayerOneDecision() == Decision.BETRAY) {
                return Decision.BETRAY;
            } else {
                return Decision.COOPERATE;
            }
        }
    }
}
