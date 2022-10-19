
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class BookControl {
   
    public BookControl() {
    }
    
    public Book createBook() {
       
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int ISBN;
        int numPages;
        String bookTitle;
        String bookAuthor;
         
        System.out.println("Ingrese el nombre del autor:");
        bookAuthor = read.nextLine();
        System.out.println("Ingrese el titulo del libro:");
        bookTitle = read.nextLine();
        System.out.println("Ingrese el numero de paginas del mismo:");
        numPages = read.nextInt();
        System.out.println("Ingrese el número de identificación internacional del libro:");
        ISBN = read.nextInt();
        
        return new Book(ISBN, numPages, bookTitle, bookAuthor);
              
    }

}
