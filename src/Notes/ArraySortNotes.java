package Notes;

import java.util.Random;
import java.util.Scanner;

public class ArraySortNotes {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Random rng = new Random();

        int[] numbers = new int[5];
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = key.nextInt();
        }
        try {
            Thread.sleep(2000);
        } catch (Exception evt) {

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "\t");
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("");

        try {
            Thread.sleep(2000);
        } catch (Exception evt) {

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "\t");
        }
        key.close();
    }

}
