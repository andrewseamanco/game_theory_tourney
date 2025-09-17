import java.util.List;
import java.util.ArrayList;

public class Game {
    private Player playerOne;
    private Player playerTwo;
    private List<Turn> gameLog;
    private int currentRound;
    private int amountOfRounds;

    public Game(Player po, Player pt, int roundAmount) {
        this.playerOne = po;
        this.playerTwo = pt;
        this.gameLog = new ArrayList<>();
        this.amountOfRounds = roundAmount;
        this.currentRound = 0;
    }

    public int getCurrentRound() {
        return this.currentRound;
    }

    public int getAmountOfRounds() {
        return this.amountOfRounds;
    }

    public void playRound() {
        Decision playerOneDecision = this.playerOne.takeTurn(0, this.gameLog, this.currentRound, this.amountOfRounds);
        Decision playerTwoDecision = this.playerTwo.takeTurn(1, this.gameLog, this.currentRound, this.amountOfRounds);
        this.gameLog.add(new Turn(playerOneDecision, playerTwoDecision));
        printTurn(playerOneDecision, playerTwoDecision);
        this.currentRound++;
    }

    public void printTurn(Decision playerOneDecision, Decision playerTwoDecision) {
        System.out.println("Player one has decided to " + getDecisionString(playerOneDecision));
        System.out.println("Player two has decided to " + getDecisionString(playerTwoDecision));
        System.out.println("");
    }

    public void scoreGame() {
        int playerOneScore = 0;
        int playerTwoScore = 0;
        for (Turn turn: this.gameLog) {
            Decision playerOneDecision = turn.getPlayerOneDecision();
            Decision playerTwoDecision = turn.getPlayerTwoDecision();

            if (playerOneDecision.equals(playerTwoDecision)) {
                if (playerOneDecision == Decision.BETRAY) {
                    playerOneScore += 1;
                    playerTwoScore += 1;
                } else {
                    playerOneScore += 3;
                    playerTwoScore += 3;
                }
            } else {
                if (playerOneDecision == Decision.BETRAY) {
                    playerOneScore += 5;
                } else {
                    playerTwoScore += 5;
                }
            }
        }
        this.playerOne.addToScore(playerOneScore);
        this.playerTwo.addToScore(playerTwoScore); 
    }

    public String getDecisionString(Decision decision) {
        return switch(decision) {
            case BETRAY -> "🛑 Betray";
            case COOPERATE -> "🟢 Cooperate";
            default -> "No choice made";
        };
    }
}