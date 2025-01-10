package Final;
/**This program is meant to be a simple game of Rock, Paper, Scissors
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rng = new Random();
        int wins, losses, ties;
        int computer;
        String name, input;
        computer = rng.nextInt(3);
        ties = 0;
        wins = 0;
        losses = 0;

        System.out.println(
                "Welcome to the game of Rock, Paper, Scissors! The rules are very simple, rock beats scissors, "
                        + "scissors beats paper and paper beats rock! All I need now is\nyour name.");
        name = key.nextLine();

        while (true) {
            computer = rng.nextInt(3);
            System.out.println("Alright " + name + "! Pick:\n[ROCK]\n[PAPER]\nOr\n[SCISSORS]");
            input = key.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("rock")) {
                if (computer == 0) {
                    ties++;
                    System.out.println("The computer picked rock so that's a tie.\nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: "
                            + "" + losses + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                } else if (computer == 1) {
                    losses++;
                    System.out.println("The computer picked paper so that's a loss.\nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: "
                            + "" + losses + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                } else if (computer == 2) {
                    wins++;
                    System.out.println("The computer picked scissors so that's a win.\nTIES: " + ties + "\nWINS: "
                            + wins + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                }
            } else if (input.equalsIgnoreCase("paper")) {
                if (computer == 0) {
                    wins++;
                    System.out.println("The computer picked rock so that's a win.\nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                } else if (computer == 1) {
                    ties++;
                    System.out.println("The computer picked paper so that's a tie. \nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                } else if (computer == 2) {
                    losses++;
                    System.out.println("The computer picked paper so that's a loss. \nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                }
            } else if (input.equalsIgnoreCase("scissors")) {
                if (computer == 0) {
                    losses++;
                    System.out.println("The computer picked rock so that's a loss. \nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                } else if (computer == 1) {
                    wins++;
                    System.out.println("The computer picked paper so that's a win. \nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                } else if (computer == 2) {
                    ties++;
                    System.out.print("The computer picked paper so that's a tie. \nTIES: " + ties + "\nWINS: " + wins
                            + "\nLOSSES: " + losses + ""
                            + "\nWould you like to play again?\n[YES]\nOr\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing Rock, Paper, Scissors by: Jeremy Whitenect.");
                        break;
                    } else {
                        System.out.println("That's not a valid option.");
                    }
                }
            } else {
                System.out.println("That is not a valid option.");
            }
        }
        key.close();
    }

}
