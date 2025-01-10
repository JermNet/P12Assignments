package Final;
/**This program is meant to be a simple game of High-Low using the Die object.
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Die playerDie = new Die();
        Die computerDie = new Die();
        int streak = 0, wins = 0, player, computer;
        String name, input;
        Scanner key = new Scanner(System.in);

        System.out.println(
                "Welcome to High-Low, first you will roll a die and then you must guess if you rolled higher, lower or the same "
                        + "as the computer. \nPlease give us your name.");
        name = key.nextLine();

        while (true) {
            player = playerDie.roll();
            computer = computerDie.roll();
            System.out.println(name + ", you rolled a " + player
                    + ". Now do you think you rolled:\n[HIGHER]\n[LOWER]\nOr\n[SAME]");
            input = key.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("higher")) {
                if (player > computer) {
                    wins++;
                    streak++;
                    System.out.println("The computer rolled a " + computer + " so you win.\nWINS: " + wins
                            + "\nSTREAK: " + streak + "\nPlay again?"
                            + "\n[YES]\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing High-Low by: Jeremy Whitenect");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else if (player <= computer) {
                    streak = 0;
                    System.out.println("The computer rolled a " + computer + " so you lose.\nWINS: " + wins
                            + "\nSTREAK: " + streak + "\nPlay again?"
                            + "\n[YES]\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing High-Low by: Jeremy Whitenect");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                }
            } else if (input.equalsIgnoreCase("lower")) {
                if (player >= computer) {
                    streak = 0;
                    System.out.println("The computer rolled a " + computer + " so you lose.\nWINS: " + wins
                            + "\nSTREAK: " + streak + "\nPlay again?"
                            + "\n[YES]\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing High-Low by: Jeremy Whitenect");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else if (player < computer) {
                    wins++;
                    streak++;
                    System.out.println("The computer rolled a " + computer + " so you win.\nWINS: " + wins
                            + "\nSTREAK: " + streak + "\nPlay again?"
                            + "\n[YES]\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing High-Low by: Jeremy Whitenect");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                }
            } else if (input.equalsIgnoreCase("same")) {
                if (player > computer || player < computer) {
                    streak = 0;
                    System.out.println("The computer rolled a " + computer + " so you lose.\nWINS: " + wins
                            + "\nSTREAK: " + streak + "\nPlay again?"
                            + "\n[YES]\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing High-Low by: Jeremy Whitenect");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                } else if (player == computer) {
                    wins++;
                    streak++;
                    System.out.println("The computer rolled a " + computer + " so you win.\nWINS: " + wins
                            + "\nSTREAK: " + streak + "\nPlay again?"
                            + "\n[YES]\n[NO]");
                    input = key.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("yes")) {

                    } else if (input.equalsIgnoreCase("no")) {
                        System.out.println("Thanks for playing High-Low by: Jeremy Whitenect");
                        break;
                    } else {
                        System.out.println("That is not a valid option.");
                    }
                }
            }
        }
        key.close();
    }

}
