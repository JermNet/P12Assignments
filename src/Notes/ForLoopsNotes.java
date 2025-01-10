package Notes;

import java.util.Scanner;
import java.util.Random;

public class ForLoopsNotes {

    public static void main(String[] args) {
        Random rng = new Random();
        Scanner key = new Scanner(System.in);
        int timeToRun;

        System.out.println("How many loops do you want?");
        timeToRun = key.nextInt();

        for (int i = 0; i < timeToRun; i++) {
            System.out.println("Loop number: " + (i + 1));
        }

        key.close();
    }

}
