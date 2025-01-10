package Notes;

import java.util.Random;
import java.util.Scanner;

public class RandomNotes {

    public static void main(String[] args) {
        Random rng = new Random();
        Scanner key = new Scanner(System.in);
        int rando, numbers;

        System.out.println("How many numbers do you want?");

        numbers = key.nextInt();
        rando = rng.nextInt(numbers) + 1;

        System.out.println(rando);
        key.close();
    }

}
