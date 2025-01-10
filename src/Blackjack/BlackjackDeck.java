package Blackjack;
import java.util.ArrayList;
import java.util.Random;

public class BlackjackDeck {
    private ArrayList<BlackjackCard> deck;

    public BlackjackDeck() {
        deck = new ArrayList<>();

        String[] suit = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] rank = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new BlackjackCard(suit[i], rank[j]));
            }
        }
    }

    public BlackjackCard drawCard() {
        BlackjackCard temp;
        temp = deck.get(0);
        deck.remove(0);
        deck.trimToSize();
        return temp;
    }

    public void shuffleDeck() {
        BlackjackCard temp;
        Random rng = new Random();
        int x, y;

        for (int i = 0; i < 5000; i++) {
            x = rng.nextInt(deck.size());
            y = rng.nextInt(deck.size());

            temp = deck.get(x);
            deck.set(x, deck.get(y));
            deck.set(y, temp);
        }
    }

    public int checkRemaining() {
        return deck.size();
    }

    public void resetDeck() {
        deck.clear();
        deck.trimToSize();
        String[] suit = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] rank = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new BlackjackCard(suit[i], rank[j]));
            }
        }

    }

}
