public class Card {
    private final int rank;
    private final Suit suit;
    public Card(Suit suit, int rank)
    {
        if (rank < 1 || rank > 13)  //ace = 1
            throw new IllegalArgumentException("Rank must be 1-13");
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit() {return this.suit;}
    public int getRank() {return this.rank;}
    @Override
    public String toString()
    {
        return rank + " of " + suit;
    }
}
