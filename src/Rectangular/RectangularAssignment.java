package Rectangular; /**This is meant to show the use of objects through a user interface
 *
 * @author jwhitenect
 *
 */
import java.util.Scanner;

public class RectangularAssignment {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        RectangularPrisim rec = new RectangularPrisim();
        String input;

        System.out.println("Welcome to the rectangular prisim building simulator, please "
                + "input the length.");
        rec.changeLength(Double.parseDouble(key.nextLine()));

        System.out.println("Now for the width...");
        rec.changeWidth(Double.parseDouble(key.nextLine()));

        System.out.println("Now for the height...");
        rec.changeHeight(Double.parseDouble(key.nextLine()));

        while (true) {
            System.out.println("This is your rectangular prisim " + rec + "\nYou can...\n"
                    + "Change the 'length'\nChange the 'width'\nChange the 'height'\n'Scale' the "
                    + "prisim\nCalculate the 'volume'\nCalculate the surface 'area'\n'End' the program");
            input = key.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("length")) {
                System.out.println("Please input your new length.");
                rec.changeLength(Double.parseDouble(key.nextLine()));
            } else if (input.equalsIgnoreCase("width")) {
                System.out.println("Please input your new width.");
                rec.changeWidth(Double.parseDouble(key.nextLine()));
            } else if (input.equalsIgnoreCase("height")) {
                System.out.println("Please input your new height.");
                rec.changeHeight(Double.parseDouble(key.nextLine()));
            } else if (input.equalsIgnoreCase("scale")) {
                System.out.println("Please input your scale factor.");
                rec.scale(Double.parseDouble(key.nextLine()));
            } else if (input.equalsIgnoreCase("volume")) {
                System.out.println("This is the current volume of your rectangular prisim: "
                        + "" + rec.volumeCalculate());
            } else if (input.equalsIgnoreCase("area")) {
                System.out.println("This is the current surface area of your rectangular "
                        + "prisim: " + rec.areaCalculate());
            } else if (input.equalsIgnoreCase("end")) {
                System.out.println("'Thank you so much for-a playing my game.' - "
                        + "Mario Mario");
                break;
            } else {
                System.out.println("Minior spelling error.");
            }
        }
        key.close();
    }

}
