import java.util.List;

public class TooNice extends Player {
    public TooNice() {
        this.name = "Too Nice";
    }

    Decision takeTurn(int position, List<Turn> turns, int round, int endRound) {
        return Decision.COOPERATE;
    }
}