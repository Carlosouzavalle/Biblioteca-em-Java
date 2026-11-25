import java.util.ArrayList;
import java.util.List;

public class listBooks {
    // referencia a lista não tem nada haver com a classe
    private List<registerBook> books = new ArrayList<>();



    public void addBooks(registerBook registerBook) {
        books.add(registerBook);
    }

    public void showAllBooks() {
        for (registerBook registerBook : books) {
            System.out.println(registerBook);
        }
    }

    // vai buscar pelo author e title
    public List<registerBook> getBooks() {
        return books;
    }
    

    public static void main(String[] args) {
        listBooks listBooks = new listBooks();
        listBooks.addBooks(new registerBook(1, "O hobbit", "J.R.R. Tolkien", true));
        
        // vai mostrar todos os livros
        // listBooks.showAllBooks();

        foundBook finder = new foundBook(listBooks);

        registerBook result = finder.findByTitle("O hobbit");

        if(result != null) {
            System.out.println("Found: " + result.getTitle() + " by " + result.getAuthor());
        } else {
            System.out.println("Book not found");
        }

    }
}
