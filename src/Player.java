import java.util.ArrayList;

public class Player {
    private final int id;
    private ArrayList<Card> hand;
    public Player(int id, ArrayList<Card> hand)
    {
        this.id = id;
        this.hand = hand;
    }
    public ArrayList<Card> getHand() {return hand;}
    public void setHand(ArrayList<Card> newHand) {hand = newHand;}
    public int getId() {return id;}
}
