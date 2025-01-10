package Library;

/**This program is meant to be a virtual library, this time using an ArrayList to have more than one "Bookshelf" object.
 *
 * @jwhitenect
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class BigLibrary {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ArrayList<Bookshelf> shelves = new ArrayList<>();
        String title, author, shelfName, input;
        int pages, shelfNum, bookNum;

        System.out.println("Welcome to the virtual library, how many bookshelves are in your library?");
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
            System.out.println("Do you want to go to your [SHELVES] or [LEAVE]?");
            input = key.nextLine();
            if (input.equalsIgnoreCase("shelves")) {
                System.out.println("What shelf do you want to access?");
                shelfName = key.nextLine();

                for (Bookshelf currentShelf : shelves) {
                    if (currentShelf.readType().equalsIgnoreCase(shelfName)) {
                        while (true) {
                            System.out.println("What would you like to do?\n[ADD BOOKS]"
                                    + "\n[REMOVE BOOKS]\n[CHANGE TITLES]\n[CHANGE AUTHORS]\n[CHANGE PAGES]\n"
                                    + "[VIEW BOOKS]\n[RETURN]");
                            input = key.nextLine().toLowerCase();
                            if (input.equalsIgnoreCase("add books")) {
                                System.out.println("How many books do you want to add?");
                                bookNum = Integer.parseInt(key.nextLine());
                                for (int i = 0; i < bookNum; i++) {
                                    System.out.println("What is the name of the book you want to add?");
                                    title = key.nextLine();
                                    System.out.println("Who wrote the book you want to add?");
                                    author = key.nextLine();
                                    System.out.println("How many pages does the book you want to add have?");
                                    pages = Integer.parseInt(key.nextLine());
                                    currentShelf.addBook(new Book(title, author, pages));
                                }

                            } else if (input.equalsIgnoreCase("remove books")) {
                                System.out.println("How many books do you want to remove?");
                                bookNum = Integer.parseInt(key.nextLine());
                                for (int i = 0; i < bookNum; i++) {
                                    System.out.println("What is the name of the book you want to remove?");
                                    currentShelf.removeBook(key.nextLine());
                                }
                            } else if (input.equalsIgnoreCase("change titles")) {
                                System.out.println("How many books do you want to change the titles of?");
                                bookNum = Integer.parseInt(key.nextLine());
                                for (int i = 0; i < bookNum; i++) {
                                    System.out.println("Please input the name of the book you want to change"
                                            + " and than the new name you want to give it.");
                                    currentShelf.changeTitle(key.nextLine(), key.nextLine());
                                }
                            } else if (input.equalsIgnoreCase("change authors")) {
                                System.out.println("How many books do you want to change the author of?");
                                bookNum = Integer.parseInt(key.nextLine());
                                for (int i = 0; i < bookNum; i++) {
                                    System.out.println("Please input the title of the book you want to "
                                            + "change then the new author you want it to have.");
                                    currentShelf.changeAuthor(key.nextLine(), key.nextLine());
                                }
                            } else if (input.equalsIgnoreCase("change pages")) {
                                System.out.println("How many books do you want to change the number of pages"
                                        + " of?");
                                bookNum = Integer.parseInt(key.nextLine());
                                for (int i = 0; i < bookNum; i++) {
                                    System.out.println("Please input the title of the book you want to "
                                            + "change then the new number of pages you want it to have.");
                                    currentShelf.changePages(key.nextLine(), Integer.parseInt(key.nextLine()));
                                }
                            } else if (input.equalsIgnoreCase("view books")) {
                                System.out.println("Here is a list of all the books in the library: \n"
                                        + currentShelf.listBooks());
                            } else if (input.equalsIgnoreCase("return")) {
                                break;
                            }

                        }
                    }
                }

            } else if (input.equalsIgnoreCase("leave")) {
                System.out.print("Thanks for using the virtual library!\n\n\t\t\t\t- TVNA");
                break;
            }
        }
        key.close();
    }

}
