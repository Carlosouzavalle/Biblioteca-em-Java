public class foundBook {

    private listBooks library;

    public foundBook(listBooks library) {
        this.library = library;
    }

    
    public registerBook findByTitle(String seachTitle) {
        for(registerBook book : library.getBooks()) {
            if(book.getTitle().equalsIgnoreCase((seachTitle))) {
                return book;
            }
        }
        return  null;
    }

}
