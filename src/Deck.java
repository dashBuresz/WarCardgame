import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public ArrayDeque<Card> cards;
    private static final int deckSize = 52;
    public Deck()
    {
        cards = new ArrayDeque<>();
        //filling up the deck
        for (int i = 0; i  < deckSize/4; i++)
            cards.add(new Card(Suit.CLUBS, i+1));
        for (int i = 0; i < deckSize/4; i++)
            cards.add((new Card(Suit.SPADES, i+1)));
        for (int i = 0; i  < deckSize/4; i++)
            cards.add(new Card(Suit.HEARTS, i+1));
        for (int i = 0; i < deckSize/4; i++)
            cards.add((new Card(Suit.DIAMONDS, i+1)));
        this.shuffle();
    }
    public void shuffle()
    {
        List<Card> list = new ArrayList<>(cards);
        Collections.shuffle(list);
        cards.clear();
        cards.addAll(list);
    }
    public int size() {return deckSize;}
}
