package Blackjack;

import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String name, input;
        BlackjackDeck deck = new BlackjackDeck();
        BlackjackHand player = new BlackjackHand();
        BlackjackHand computer = new BlackjackHand();

        System.out.println("Welcome to the BlackJack game! The rules are simple, you can draw as many"
                + " cards as you like but if you get over 21 you lose! If you \nget a score higher than "
                + "the dealer you win! Now what is your name?");
        name = key.nextLine();

        while (true) {

            deck.shuffleDeck();
            computer.drawCard(deck.drawCard());
            computer.drawCard(deck.drawCard());
            player.drawCard(deck.drawCard());
            player.drawCard(deck.drawCard());
            while (true) {
                if (computer.getTotalValue() < 16) {
                    computer.drawCard(deck.drawCard());
                }
                if (player.getTotalValue() > 21) {
                    player.canReduce();
                    if (player.canReduce() == true) {
                        player.reduce();
                    }
                }
                if (player.getTotalValue() < 21) {
                    System.out.println("Hello " + name + "!\nHere is the dealer's card you can see: "
                            + computer.showCard() + ". "
                            + "\nHere is your hand of cards: " + player.showHand() + "\nWould you like to [DRAW]"
                            + " a card or [END] your turn?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("draw")) {
                        player.drawCard(deck.drawCard());
                    } else if (input.equalsIgnoreCase("end")) {
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                } else if (player.getTotalValue() == 21) {
                    System.out.println("Congrats, you got a 21 with this hand: " + player.showHand() + ""
                            + " \nwhich means you won the game!"
                            + "\nWould you like to play again? [YES] or [NO]?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("no")) {
                        break;
                    } else if (input.equalsIgnoreCase("yes")) {
                        deck.resetDeck();
                        computer.discardHand();
                        player.discardHand();
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                } else if (player.getTotalValue() > 21) {
                    System.out.println("You got a " + player.getTotalValue() + " with this hand: " + player.showHand()
                            + " which means you lose. "
                            + "\nWould you like to play again? [YES] or [NO]?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("no")) {
                        break;
                    } else if (input.equalsIgnoreCase("yes")) {
                        deck.resetDeck();
                        computer.discardHand();
                        player.discardHand();
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                }

            }
            if (input.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing the game of BlackJack!\n\n\n\t\t\t\t"
                        + "-Big J");
                break;
            }
            while (true) {
                if (input.equalsIgnoreCase("yes")) {
                    break;
                }
                if (computer.getTotalValue() > 21) {
                    computer.canReduce();
                    if (computer.canReduce() == true) {
                        computer.reduce();
                    }
                }
                if (computer.getTotalValue() == 21) {
                    System.out.println("The dealer got exactly 21 with this hand: " + computer.showHand() + ""
                            + " which means they win!\n"
                            + "Would you like to play again? [YES] or [NO]?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {
                        deck.resetDeck();
                        computer.discardHand();
                        player.discardHand();
                        break;
                    } else if (input.equalsIgnoreCase("no")) {
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                } else if (computer.getTotalValue() > 21) {
                    System.out.println("The dealer got a " + computer.getTotalValue() + " with this hand: "
                            + computer.showHand() + ""
                            + "\nwhich means you win!\nWould"
                            + " you like to play again? [YES] or [NO]?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {
                        deck.resetDeck();
                        computer.discardHand();
                        player.discardHand();
                        break;
                    } else if (input.equalsIgnoreCase("no")) {
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                } else if (computer.getTotalValue() > player.getTotalValue()) {
                    System.out.println("The dealer got a " + computer.getTotalValue() + " "
                            + "with this hand: " + computer.showHand() + " and you got a " + player.getTotalValue()
                            + " "
                            + "with this hand:\n" + player.showHand() + " which means you lose.\n"
                            + "Would you like to play again? [YES] or [NO]?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {
                        deck.resetDeck();
                        computer.discardHand();
                        player.discardHand();
                        break;
                    } else if (input.equalsIgnoreCase("no")) {
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                } else if (computer.getTotalValue() < player.getTotalValue()) {
                    System.out.println("The dealer got a " + computer.getTotalValue() + " "
                            + "with this hand: " + computer.showHand() + " and you got a " + player.getTotalValue()
                            + " "
                            + "with this hand:\n" + player.showHand() + " which means you win!\n"
                            + "Would you like to play again? [YES] or [NO]?");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {
                        deck.resetDeck();
                        computer.discardHand();
                        player.discardHand();
                        break;
                    } else if (input.equalsIgnoreCase("no")) {
                        break;
                    } else {
                        System.out.println("Error, not a valid option.");
                    }
                }

            }
            if (input.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing the game of BlackJack!\n\n\n\t\t\t\t"
                        + "-Big J");
                break;
            }

        }
        key.close();
    }

}
