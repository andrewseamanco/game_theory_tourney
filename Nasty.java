import java.util.List;

public class Nasty extends Player {
    public Nasty() {
        this.name = "Nasty";
    }

    Decision takeTurn(int position, List<Turn> turns, int round, int endRound) {
        return Decision.BETRAY;
    }
}