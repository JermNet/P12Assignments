package Notes;

import java.util.ArrayList;
import java.util.*;

public class ArrayListNotes {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner key = new Scanner(System.in);

        int numberOfNames;

        System.out.println("How many names to enter?");
        numberOfNames = Integer.parseInt(key.nextLine());

        for (int i = 0; i < numberOfNames; i++) {
            names.add(key.nextLine());
        }
        System.out.println(names);
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(names.get(i));
        }

        names.add("You forgor the other guy");

        System.out.println(names);

        names.remove(2);

        System.out.println(names);

        names.sort(null);

        System.out.println(names);
        key.close();
    }

}
