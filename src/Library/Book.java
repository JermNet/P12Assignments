package Library;

public class Book {
    private int numberOfPages;
    private String title, author;

    public Book(String t, String a, int n) {
        title = t;
        author = a;
        numberOfPages = n;
    }

    public String readAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String readTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int readPages() {
        return numberOfPages;
    }

    public void setPages(int n) {
        numberOfPages = n;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPages: " + numberOfPages;
    }
}
