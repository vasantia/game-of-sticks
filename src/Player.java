import java.util.Scanner;

/**
 * Created by vasantia on 6/21/16.
 */
public class Player {

    private String name;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int chooseSticks() {
        int choice = 0;
        System.out.println("How many sticks would you like to choose? (1-3)");
        choice = scanner.nextInt();

        if (1 > choice && choice > 3) {
            System.out.println("Please choose 1, 2 or 3 sticks.");
        } else {
            choice = scanner.nextInt();
        }
        return choice;
    }
}
