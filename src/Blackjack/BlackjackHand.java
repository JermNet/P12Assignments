package Blackjack;

import java.util.ArrayList;

public class BlackjackHand {
    private ArrayList<BlackjackCard> hand = new ArrayList<>();

    public BlackjackHand() {
        hand = new ArrayList<>();
    }

    public void drawCard(BlackjackCard c) {
        hand.add(c);
    }

    public void discardHand() {
        hand.clear();
        hand.trimToSize();
    }

    public int getTotalValue() {
        int total = 0;

        for (BlackjackCard currentCard : hand) {
            total += currentCard.readValue();
        }

        return total;
    }

    public BlackjackCard showCard() {
        return hand.get(0);
    }

    public ArrayList showHand() {
        return hand;
    }

    public boolean canReduce() {
        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).readRank().equalsIgnoreCase("Ace")) {
                for (int j = 0; j < hand.size(); j++) {
                    if (hand.get(j).readValue() == 11) {
                        return true;
                    }

                }
            }

        }
        return false;
    }

    public void reduce() {
        for (int i = 0; i < hand.size(); i++) {
            hand.get(i).changeValue();
        }
    }

}
