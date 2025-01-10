package Library;

/**This program is meant to be a virtual library using the "Bookshelf" and "BookObject" objects.
 *
 * @jwhitenect
 *
 */
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        String input, author, title;
        int bookNum, pages;
        Bookshelf shelf = new Bookshelf("Users books");
        Scanner key = new Scanner(System.in);

        while (true) {
            System.out.println("This is the virtual library, what would you like to do?\n[ADD BOOKS]"
                    + "\n[REMOVE BOOKS]\n[CHANGE TITLES]\n[CHANGE AUTHORS]\n[CHANGE PAGES]\n"
                    + "[VIEW BOOKS]\n[LEAVE]");
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
                    shelf.addBook(new Book(title, author, pages));
                }

            } else if (input.equalsIgnoreCase("remove books")) {
                System.out.println("How many books do you want to remove?");
                bookNum = Integer.parseInt(key.nextLine());
                for (int i = 0; i < bookNum; i++) {
                    System.out.println("What is the name of the book you want to remove?");
                    shelf.removeBook(key.nextLine());
                }
            } else if (input.equalsIgnoreCase("change titles")) {
                System.out.println("How many books do you want to change the titles of?");
                bookNum = Integer.parseInt(key.nextLine());
                for (int i = 0; i < bookNum; i++) {
                    System.out.println("Please input the name of the book you want to change"
                            + " and than the new name you want to give it.");
                    shelf.changeTitle(key.nextLine(), key.nextLine());
                }
            } else if (input.equalsIgnoreCase("change authors")) {
                System.out.println("How many books do you want to change the author of?");
                bookNum = Integer.parseInt(key.nextLine());
                for (int i = 0; i < bookNum; i++) {
                    System.out.println("Please input the title of the book you want to "
                            + "change then the new author you want it to have.");
                    shelf.changeAuthor(key.nextLine(), key.nextLine());
                }
            } else if (input.equalsIgnoreCase("change pages")) {
                System.out.println("How many books do you want to change the number of pages"
                        + " of?");
                bookNum = Integer.parseInt(key.nextLine());
                for (int i = 0; i < bookNum; i++) {
                    System.out.println("Please input the title of the book you want to "
                            + "change then the new number of pages you want it to have.");
                    shelf.changePages(key.nextLine(), Integer.parseInt(key.nextLine()));
                }
            } else if (input.equalsIgnoreCase("view books")) {
                System.out.println("Here is a list of all the books in the library: \n" + shelf.listBooks());
            } else if (input.equalsIgnoreCase("leave")) {
                System.out.print("Thanks for using the virtual library!\n\n\t\t\t\t- TVNA");
                break;
            }

        }
        key.close();
    }

}
