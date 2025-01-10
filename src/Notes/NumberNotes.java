package Notes;

import java.util.Scanner;
import java.util.Random;

public class NumberNotes {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rng = new Random();
        int number;
        String word;
        word = "repeat";

        number = 5;
        number++;
        while (true) {
            System.out.println("Want to stop?");
            if (key.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }
        key.close();
    }

}
