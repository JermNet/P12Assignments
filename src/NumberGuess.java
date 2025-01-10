/**This is meant to show the use of while statements
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rng = new Random();
        int guess, ranNum, end;
        end = 0;
        guess = 100;
        ranNum = rng.nextInt(10) + 1;

        System.out.println("From one to ten what number am I thinking of?");
        while (guess != ranNum) {
            if (end != 5) {
                end++;
                guess = key.nextInt();
            }
            if (guess == ranNum) {
                System.out.println("Congrats, you got the number correct! Guesses: " + end);
                break;
            }
            if (end == 5) {
                System.out.println("Sorry, you ran out of guesses, the number was " + ranNum + ".");
                break;
            }

        }
        key.close();
    }

}
