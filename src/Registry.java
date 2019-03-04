import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents a registry for book. Holding a collection of
 * books with title, author, date, genre, pages, publisher and editions.
 *
 * From this register you can:
 * - Add a book
 * - Remove a book
 * - Find book by title
 * - Find book by author
 * - List all books
 *
 * @author Yusuf
 * @version v0.1
 */
public class Registry
{
    private ArrayList<Book> bookRegistry;

    /**
     * The constructor for the class registry
     */
    public Registry()
    {
        this.bookRegistry = new ArrayList<>();
    }

    /**
     * Adds a book to the registry.
     * @param book The book to be added to the registry.
     *             If <code>null</code>, nothing is being added.
     */
    public void addBook(Book book)
    {
        if (book != null)
        {
            this.bookRegistry.add(book);
        }
    }

    /**
     * Remove a book from the book registry
     * @param title The title of the book to be removed
     */
    public void removeBook(String title)
    {
        //Ask the collection (ArrayList) for its iterator
        Iterator<Book> it = this.bookRegistry.iterator();
       while(it.hasNext())
       {
           Book b = it.next();
           if(b.getTitleOfBook().equals(title))
           {
               System.out.println("Book has been removed, " + b.getTitleOfBook());
               bookRegistry.remove(b);
           }
       }
    }

    /**
     * Search the book registry for book with the title given by the parameter
     * print the book if found
     * @param title the author to search for
     */
    public void listByTitle(String title)
    {
        for(Book book : bookRegistry)
        {
            if(book.getTitleOfBook().toLowerCase().contains(title))
            {
                printBook(book);
            }
        }
    }

    /**
     * Search the book registry for book with the series given by the parameter
     * print the book if found.
     * @param series the author to search for
     */
    public void listBySeries(String series)
    {
        for(Book book : bookRegistry)
        {
            if(book.getSeriesOfBook().toLowerCase().contains(series))
            {
                printBook(book);
            }
        }
    }

    /**
     * Search the book registry for book with the author given by the parameter
     * print the book if found
     * @param author the author to search for
     */
    public void listByAuthor(String author)
    {
        for(Book book : bookRegistry)
        {
            if(book.getAuthorOfBook().toLowerCase().contains(author))
            {
                printBook(book);
            }
        }
    }

    /**
     * Search the book registry for book with the publisher given by the parameter
     * print the book if found
     * @param publisher the publisher to search for
     */
    public void listByPublisher(String publisher)
    {
        for(Book book : bookRegistry)
        {
            if(book.getPublisherOfBook().toLowerCase().contains(publisher))
            {
                printBook(book);
            }
        }
    }

    /**
     * Prints the information of the book provided. This is a private
     * helper method used by the other methods in the class.
     *
     * @param book The Book to print the details of.
     */
    public void printBook(Book book)
    {
        System.out.println("Title: " + book.getTitleOfBook());
        System.out.println("Series: " + book.getSeriesOfBook());
        System.out.println("Author: " + book.getAuthorOfBook());
        System.out.println("Date: " + book.getDateOfBook());
        System.out.println("Genre: " + book.getGenreOfBook());
        System.out.println("Pages: " + book.getPagesOfBook());
        System.out.println("Publisher: " + book.getPublisherOfBook());
        System.out.println("Edition: " + book.getEditionOfBook());
        System.out.println("---------------------------------------");
    }

    /**
     * Lists all books in the register by printing them to the
     * out-stream (console).
     */
    public void listAllBook()
    {
        // for-each
        for (Book b : this.bookRegistry)
        {
            printBook(b);
        }
    }
}
