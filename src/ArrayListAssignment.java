/**This program is used to show the use of arrays

 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class ArrayListAssignment {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("How many anime have you watched this week?");

        String[] input = new String[key.nextInt()];

        key.nextLine();

        for (int i = 0; i < input.length; i++) {
            System.out.println("What is the name of anime " + (i + 1) + "?");
            input[i] = key.nextLine();
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println("You watched " + input[i] + " this week!");
        }
        key.close();

    }

}
