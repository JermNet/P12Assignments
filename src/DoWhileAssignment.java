/**This is meant to show the use of do while loops
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;
import java.util.Random;

public class DoWhileAssignment {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rng = new Random();
        int numOne, numTwo, math;
        String yes = "no";

        numOne = rng.nextInt(100) + 1;
        numTwo = rng.nextInt(100) + 1;
        math = rng.nextInt(4);

        do {
            if (math == 0) {
                System.out.println("The sum of " + numOne + " and " + numTwo + " is "
                        + "" + (numOne + numTwo));
                System.out.println("Play again? (yes or no)");
                yes = key.nextLine();
                numOne = rng.nextInt(100) + 1;
                numTwo = rng.nextInt(100) + 1;
                math = rng.nextInt(4);
            } else if (math == 1) {
                System.out.println("The difference between " + numOne + " and " + numTwo + " is "
                        + "" + (numOne - numTwo));
                System.out.println("Play again? (yes or no)");
                yes = key.nextLine();
                numOne = rng.nextInt(100) + 1;
                numTwo = rng.nextInt(100) + 1;
                math = rng.nextInt(4);
            } else if (math == 2) {
                System.out.println("The product of " + numOne + " and " + numTwo + " is "
                        + (numOne * numTwo));
                System.out.println("Play again? (yes or no)");
                yes = key.nextLine();
                numOne = rng.nextInt(100) + 1;
                numTwo = rng.nextInt(100) + 1;
                math = rng.nextInt(4);
            } else if (math == 3) {
                System.out.println("The dividend of " + numOne + " and " + numTwo + " is "
                        + (numOne / numTwo));
                System.out.println("Play again? (yes or no)");
                yes = key.nextLine();
                numOne = rng.nextInt(100) + 1;
                numTwo = rng.nextInt(100) + 1;
                math = rng.nextInt(4);
            } else {
                System.out.println("Now how did that happen?");
            }

        } while (yes.equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing!\n\n\n\t\t-Jeremy");
        key.close();

    }

}
