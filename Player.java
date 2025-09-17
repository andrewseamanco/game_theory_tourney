import java.util.List;

public abstract class Player {
    private int score;
    public String name;

    public Player() {
        this.score = 0;
    }

    abstract Decision takeTurn(int position, List<Turn> turns, int round, int endRound);

    public void addToScore(int newScore) {
        this.score += newScore;
    }

    public void printScore() {
        System.out.println(name + "'s score: " + this.score);
    }
}