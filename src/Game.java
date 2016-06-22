import java.util.Scanner;

/**
 * Created by vasantia on 6/21/16.
 */
public class Game {

    private Player player1;
    private Player player2;
    private Player currentPlayer = null;
    private Scanner scanner = new Scanner(System.in);

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

        while (total < 10 || total > 100) {
            System.out.println("Please pick a number from 10 to 100");
            total = scanner.nextInt();
        }
        return total;
    }

    public void runGame(){
        int total = startTotal();
        currentPlayer = player1;

        System.out.printf("There are %d sticks on the starting board.\n", total);

        while(total >= 2) {
            int choice = currentPlayer.chooseSticks();
            total -= choice;

            System.out.printf("%s takes %d sticks, there are %d sticks remaining.\n", currentPlayer.getName(), choice, total);
            changePlayer();
        }
        if (total < 1) {
            System.out.printf("You took the last stick, so %s is the winner.\n", currentPlayer.getName());
        }
        if (total == 1){
            System.out.printf("%s has to take the last stick.\n", currentPlayer.getName());
            changePlayer();
            System.out.printf("%s is the winner!\n", currentPlayer.getName());
        }
    }

}
