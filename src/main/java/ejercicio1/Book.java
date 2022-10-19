package ejercicio1;

/**
 *
 * @author Sofi
 */
public class Book {
    
    private int ISBN;
    private int numPages;
    private String bookTitle;
    private String bookAuthor;

    public Book() {
    }

    public Book(int ISBN, int numPages, String bookTitle, String bookAuthor) {
        this.ISBN = ISBN;
        this.numPages = numPages;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", numPages=" + numPages + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + '}';
    } 
   
}
