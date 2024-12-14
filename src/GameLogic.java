import java.util.ArrayList;

public class GameLogic {
    private int round;
    private ArrayList<Card> transfer;
    public void war(Player player1, Player player2)
    {

    }
    public void takeCard(Player winner, Player loser)
    {

    }
    public boolean executeRound(Player player1, Player player2)
    {
        int p1size = player1.getHand().size();
        Card p1LastCard = player1.getHand().get(p1size);
        int p2size = player2.getHand().size();
        Card p2LastCard = player2.getHand().get(p2size);
        if (p1LastCard.getRank() == p2LastCard.getRank())
        {
            transfer.add(p1LastCard);
            transfer.add(p2LastCard);
            war(player1, player2);
        }
        return true; //will return true if one of the player have all the cards in their posession after the round
    }
}
