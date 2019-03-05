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
    public static ArrayList<Book> bookRegistry;

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
    public Book removeBook(String title)
    {
        //Ask the collection (ArrayList) for its iterator
        Iterator<Book> it = this.bookRegistry.iterator();
       while(it.hasNext())
       {
           Book b = it.next();
           if(b.getTitleOfBook().equals(title))
           {
               it.remove();
               return b;
           }
       }
       return null;
    }

    /**
     * Search the book registry for book with the title given by the parameter
     * print the book if found
     * @param title the author to search for
     */
    public ArrayList<Book> listByTitle(String title)
    {
        boolean found = false;
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book book : bookRegistry)
        {
            String titleString = book.getTitleOfBook().toLowerCase();
            if(titleString.contains(title))
            {
                found = true;
                bookList.add(book);
            }
        }
        if(!found)
        {
            return null;
        }
        return bookList;
    }

    /**
     * Search the book registry for book with the series given by the parameter
     * print the book if found.
     * @param series the author to search for
     */
    public ArrayList<Book> listBySeries(String series)
    {
        boolean found = false;
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book book : bookRegistry)
        {
            String seriesString = book.getSeriesOfBook().toLowerCase();
            if(seriesString.contains(series))
            {
                found = true;
                bookList.add(book);
            }
        }
        if(!found)
        {
            return null;
        }
        return bookList;
    }

    /**
     * Search the book registry for book with the author given by the parameter
     * print the book if found
     * @param author the author to search for
     */
    public ArrayList<Book> listByAuthor(String author)
    {
        boolean found = false;
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book book : bookRegistry)
        {
            String authorString = book.getAuthorOfBook().toLowerCase();
            if(authorString.contains(author))
            {
                found = true;
                bookList.add(book);
            }
        }
        if(!found)
        {
            return null;
        }
        return bookList;
    }

    /**
     * Search the book registry for book with the publisher given by the parameter
     * print the book if found
     * @param publisher the publisher to search for
     */
    public ArrayList<Book> listByPublisher(String publisher)
    {
        boolean found = false;
        ArrayList<Book> bookList = new ArrayList<>();
        for(Book book : bookRegistry)
        {
            String publisherString = book.getPublisherOfBook().toLowerCase();
            if(publisherString.contains(publisher))
            {
                found = true;
                bookList.add(book);
            }
        }
        if(!found)
        {
            return null;
        }
        return bookList;
    }

    /**
     * Lists all books in the register by printing them to the
     * out-stream (console).
     */
    public ArrayList<Book> listAllBook()
    {
        boolean found = false;
        ArrayList<Book> bookList = new ArrayList<>();

        for(Book book : bookRegistry)
        {
            found = true;
            bookList.add(book);
        }
        if(!found)
        {
            return null;
        }
        return bookList;
    }
}
