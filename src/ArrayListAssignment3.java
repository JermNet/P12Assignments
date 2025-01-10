/**This program shows the use of ArrayLists
 *
 * jwhitenect
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListAssignment3 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int numNames;
        String input;

        while (true) {
            System.out.println("How many of your favorite characters do you want to list?");
            numNames = Integer.parseInt(key.nextLine());

            for (int i = 0; i < numNames; i++) {
                System.out.println("Please list your character.");
                names.add(key.nextLine());
            }
            System.out.println("Here are your names:" + names);

            names.sort(null);
            System.out.println("Here are your names alphabeticaly:" + names + "\nWould you "
                    + "like to 'list' more characters or 'stop'?");
            input = key.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        }
        System.out.println("Thanks for using the program.\n\n\t\t\t\t- Big J");
        key.close();
    }

}
