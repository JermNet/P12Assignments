package Library;

import java.util.Scanner;
import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<Bookshelf> shelves = new ArrayList<>();
        String title, author, shelfName;
        int pages, shelfNum;

        System.out.println("How many bookshelves are in your library?");
        shelfNum = Integer.parseInt(key.nextLine());

        for (int i = 0; i < shelfNum; i++) {
            System.out.println("What genre of books will be going on shelf " + (i + 1) + "?");
            shelves.add(new Bookshelf(key.nextLine()));

        }

        while (true) {
            System.out.println("Your shelves are: ");
            for (int i = 0; i < shelves.size(); i++) {
                System.out.println(shelves.get(i).readType());
            }

            System.out.println("What shelf do you want to access?");
            shelfName = key.nextLine();

            for (Bookshelf currentShelf : shelves) {
                if (currentShelf.readType().equalsIgnoreCase(shelfName)) {

                }
            }
        }
    }

}
