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

    // vai nos ajudar a encontrar os livros
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + available;
    }
}
