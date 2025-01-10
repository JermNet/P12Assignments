package Blackjack;

public class BlackjackCard {
    private int value;
    public String suit, rank;

    public BlackjackCard(String s, String r) {
        suit = s;
        rank = r;
        switch (rank) {
            case "Ace":
                value = 11;
                break;

            case "Two":
                value = 2;
                break;

            case "Three":
                value = 3;
                break;

            case "Four":
                value = 4;
                break;

            case "Five":
                value = 5;
                break;

            case "Six":
                value = 6;
                break;

            case "Seven":
                value = 7;
                break;

            case "Eight":
                value = 8;
                break;

            case "Nine":
                value = 9;
                break;

            case "Ten":
            case "Jack":
            case "Queen":
            case "King":
                value = 10;
                break;

            default:
                value = 0;

        }
    }

    public int readValue() {
        return value;
    }

    public String readSuit() {
        return suit;
    }

    public String readRank() {
        return rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public void changeValue() {
        if (value == 11) {
            value = 1;
            return;
        }
        return;
    }
}
