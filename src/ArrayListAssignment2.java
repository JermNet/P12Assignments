/**This program shows the use of multiple arrays used to sort.
 *
 * jwhitenect
 *
 */
import java.util.Scanner;

public class ArrayListAssignment2 {

    public static void main(String[] args) {
        String[] name;
        int[] age;
        String nameTemp, input;
        int ageTemp;

        Scanner key = new Scanner(System.in);

        System.out.println("How many people are in your family?");

        name = new String[Integer.parseInt(key.nextLine())];
        age = new int[name.length];

        for (int i = 0; i < name.length; i++) {
            System.out.println("What are the names of your family members?");
            name[i] = key.nextLine();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println("And their age?");
            age[i] = Integer.parseInt(key.nextLine());
        }
        System.out.println("How would you like to sort the info?\n[ALPHA ASCENDING]\n[ALPHA DECENDING]\n"
                + "[AGE ASCENDING]\n[AGE DECENDING]");
        input = key.nextLine().toLowerCase();

        if (input.equalsIgnoreCase("age ascending")) {
            for (int i = 0; i < name.length - 1; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (age[i] > age[j]) {
                        ageTemp = age[i];
                        age[i] = age[j];
                        age[j] = ageTemp;
                        nameTemp = name[i];
                        name[i] = name[j];
                        name[j] = nameTemp;
                    }

                }
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println("" + name[i] + ": " + age[i]);

            }
        } else if (input.equalsIgnoreCase("age decending")) {
            for (int i = 0; i < name.length; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (age[i] < age[j]) {
                        ageTemp = age[i];
                        age[i] = age[j];
                        age[j] = ageTemp;
                        nameTemp = name[i];
                        name[i] = name[j];
                        name[j] = nameTemp;

                    }

                }
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println("" + name[i] + ": " + age[i]);

            }
        } else if (input.equalsIgnoreCase("alpha ascending")) {
            for (int i = 0; i < name.length; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (name[i].compareToIgnoreCase(name[j]) > 0) {
                        nameTemp = name[i];
                        name[i] = name[j];
                        name[j] = nameTemp;
                        ageTemp = age[i];
                        age[i] = age[j];
                        age[j] = ageTemp;
                    }

                }
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println("" + name[i] + ": " + age[i]);

            }
        } else if (input.equalsIgnoreCase("alpha decending")) {
            for (int i = 0; i < name.length; i++) {
                for (int j = i + 1; j < name.length; j++) {
                    if (name[i].compareToIgnoreCase(name[j]) < 0) {
                        nameTemp = name[i];
                        name[i] = name[j];
                        name[j] = nameTemp;
                        ageTemp = age[i];
                        age[i] = age[j];
                        age[j] = ageTemp;
                    }

                }
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println("" + name[i] + ": " + age[i]);

            }
        }
        key.close();

    }

}
