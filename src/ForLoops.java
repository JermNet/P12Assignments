/**This is meant to show the use of for while loops
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numOne, numTwo, sum;
        sum = 0;

        System.out.println("Pick two numbers and we will calculate the sum of those numbers "
                + "and all the numbers inbetween.");

        numOne = key.nextInt();

        System.out.println("Now for the second number.");

        numTwo = key.nextInt();

        for (int i = numOne; i <= numTwo; i++) {
            sum += i;
            System.out.println("" + sum);
        }
        key.close();
    }

}
