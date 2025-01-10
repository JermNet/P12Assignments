/**This is meant to show the use of pseudo-random number generation
 *
 * @author jwhitenect
 *
 */
import java.util.Random;

public class RandomWork {

    public static void main(String[] args) {
        Random rng = new Random();
        int numOne, numTwo, math;

        numOne = rng.nextInt(100) + 1;
        numTwo = rng.nextInt(100) + 1;
        math = rng.nextInt(4);

        if (math == 0) {
            System.out.println("The sum of " + numOne + " and " + numTwo + " is "
                    + "" + (numOne + numTwo));
        } else if (math == 1) {
            System.out.println("The difference between " + numOne + " and " + numTwo + " is "
                    + "" + (numOne - numTwo));
        } else if (math == 2) {
            System.out.println("The product of " + numOne + " and " + numTwo + " is "
                    + (numOne * numTwo));
        } else if (math == 3) {
            System.out.println("The dividend of " + numOne + " and " + numTwo + " is "
                    + (numOne / numTwo));
        } else {
            System.out.println("Now how did that happen?");
        }

    }

}
