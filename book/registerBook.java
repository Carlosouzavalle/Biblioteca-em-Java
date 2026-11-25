import java.util.ArrayList;
import java.util.List;

public class registerBook {

    int id;
    String title;
    String author;
    boolean available;

    public registerBook(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }


    // temporary
    public void showBooks(registerBook registerBooks) {
        System.out.println(registerBooks.title + " - " + registerBooks.author + " - " + "avaible: " + registerBooks.available);
    }



    public static void main(String[] args) {

        List<registerBook> registerBooksInTheLibrary = new ArrayList<>();
        registerBooksInTheLibrary.add(new registerBook(1, "O hobbit", "J.R.R. Tolkien", true));

        System.out.println(registerBooksInTheLibrary);


        for (registerBook book : registerBooksInTheLibrary) {
            book.showBooks(book);
        }

    
    }

}