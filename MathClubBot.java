import java.util.List;
import java.util.Random;

public class MathClubBot extends Player {
    public MathClubBot() {
        this.name = "Random Bot";
    }

    Decision takeTurn(int position, List<Turn> turns, int round, int endRound) {
        Random random = new Random();
        int number = random.nextInt(100);

        if (number % 2 == 0) {
            return Decision.COOPERATE;
        } else {
            return Decision.BETRAY;
        }
     }
}