import java.util.List;

public class Sneaky extends Player {
    public Sneaky() {
        this.name = "Sneaky";
    }

    Decision takeTurn(int position, List<Turn> turns, int round, int endRound) {
        if (round < (endRound / 2)) {
            return Decision.COOPERATE;
        } else {
            return Decision.BETRAY;
        }
    }
}