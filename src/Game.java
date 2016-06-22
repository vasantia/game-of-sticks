import java.util.Scanner;

/**
 * Created by vasantia on 6/21/16.
 */
public class Game {

    private Player player1;
    private Player player2;
    private int count;
    private Player currentPlayer = null;
    private Player loser = null;
    private Scanner scanner = new Scanner(System.in);

    public int subCount(int count) {
        this.count -= count;
        return this.count;
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    public void changePlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public int startTotal() {
        int total = 0;

        System.out.println("Please choose the number of sticks to begin with (10-100)");

        while(!(total >= 10 && total <= 100)) {
            System.out.println("Please pick a number from 10 to 100");

        }
            if (total >= 10 && total <= 100){
            total = scanner.nextInt();
        }
        int startTotal = total;
        return startTotal;
    }
    public int newTotal() {
        int total = startTotal();
        boolean turnOver = false;

        System.out.format("It is %s's turn to choose\n", currentPlayer.getName());
        do {
            int choice = currentPlayer.chooseSticks();
            System.out.printf("You chose %d sticks.\n", choice);
            newTotal() = total - choice;
            return newTotal();

            if (turn) {
                }
        }
    }


    public Player runGame() {
        int newTotal = 0;
        currentPlayer = player1;

        System.out.printf("There are %d sticks on the starting board.\n", startTotal());

        while (loser == null) ;
//        System.out.printf("%s takes %d sticks, there are %d sticks remaining.\n", currentPlayer, )

        if (currentPlayer.newTotal <= 1) {
            newTotal = startTotal() - Player.choice;
            return currentPlayer;
            System.out.printf("%s takes %d sticks, there are %d sticks remaining.\n", currentPlayer, currentPlayer.chooseSticks(),newTotal);
    }

    else

    {
        changePlayer();
    }

    loser = currentPlayer;
    return loser;

    }
}

//
//        while(winner == null){
//            Turn turn = new Turn(currentPlayer);
//            currentPlayer.addScore(turn.runTurn());
//            System.out.format("%s's score is now %d\n", currentPlayer.getName(), currentPlayer.getScore());
//
//            if(currentPlayer.getScore() >= WINSCORE){
//                winner = currentPlayer;
//            }
//            else{
//                switchPlayer();
//            }
//        }
//
//        System.out.format("Winner is %s with %d points\n", winner.getName(), winner.getScore());
//
//        return winner;