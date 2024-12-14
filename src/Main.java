import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Deck deck;
    private static Player player1;
    private static Player player2;
    private static void gameInit()
    {
        deck = new Deck();
        player1 = new Player(1, new ArrayList<Card>());
        player2 = new Player(2, new ArrayList<Card>());
        //create the deck and deal the cards
        for (int i = 0; i < deck.size(); i++)
        {
            if (i < deck.size()/2)
                player1.getHand().add(deck.geti(i));
            else
                player2.getHand().add(deck.geti(i));
        }
    }
    public static void main(String[] args) {
        gameInit();
        GameState gameState = GameState.NORM;
        GameLogic gameLogic = new GameLogic();
        while (gameState != GameState.END)
        {
            if (gameLogic.executeRound(player1, player2))
                gameState = GameState.END;
        }
    }
}