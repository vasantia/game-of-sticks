/**
 * Created by vasantia on 6/21/16.
 */
public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Wilma");
        Player player2 = new Player("Betty");
        Game game = new Game(player1, player2);
        game.runGame();

    }
}
