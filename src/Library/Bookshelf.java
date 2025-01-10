package Library;

import java.util.ArrayList;

public class Bookshelf {
    private String typeOfBooks;
    private ArrayList<Book> books;

    public Bookshelf(String t) {
        typeOfBooks = t;
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public String listBooks() {
        String str = "";
        for (int i = 0; i < books.size(); i++) {
            str += books.get(i);
            str += "\n\n";
        }
        return str;
    }

    public String listTitles() {
        String str = "";
        for (int i = 0; i < books.size(); i++) {
            str += books.get(i).readTitle();
            str += "\n\n";
        }
        return str;
    }

    public String listAuthors() {
        String str = "";
        for (int i = 0; i < books.size(); i++) {
            str += books.get(i).readAuthor();
            str += "\n\n";
        }
        return str;
    }

    public String listPages() {
        String str = "";
        for (int i = 0; i < books.size(); i++) {
            str += books.get(i).readPages();
            str += "\n\n";
        }
        return str;
    }

    public void changeTitle(String current, String newTitle) {
        for (Book currentBook : books) {
            if (currentBook.readTitle().equalsIgnoreCase(current)) {
                currentBook.setTitle(newTitle);
            }
        }
    }

    public void changeAuthor(String current, String newAuthor) {
        for (Book currentBook : books) {
            if (currentBook.readTitle().equalsIgnoreCase(current)) {
                currentBook.setAuthor(newAuthor);
            }
        }
    }

    public void changePages(String current, int newPages) {
        for (Book currentBook : books) {
            if (currentBook.readTitle().equalsIgnoreCase(current))
                ;
            {
                currentBook.setPages(newPages);
            }
        }
    }

    public void removeBook(String title) {
        for (Book currentBook : books) {
            if (currentBook.readTitle().equalsIgnoreCase(title)) {
                books.remove(currentBook);
                return;
            }
        }
    }

    public String readType() {
        return typeOfBooks;
    }
}
