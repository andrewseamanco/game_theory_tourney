import java.util.List;
import java.util.ArrayList;

public class Runner {
    public static void main(String args []) {
        List<Player> players = new ArrayList<>();
        players.add(new TooNice());
        players.add(new Nasty());
        players.add(new TitForTat());
        players.add(new Sneaky());
        players.add(new MathClubBot());
        players.add(new RationalBot());

        for (int i = 0; i < players.size(); i++) {
            for (int j = i+1; j < players.size(); j++) {
                Game game = new Game(players.get(i), players.get(j), 25);

                while(game.getCurrentRound() != game.getAmountOfRounds()) {
                    game.playRound();
                }
                game.scoreGame();
            }
        }

        for (Player player: players) {
            player.printScore();
        }
    }
}