import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

// creates a class for registry class test
public class RegistryTest {
    private Registry bookRegistery;     // registry variable
    private Book book;                  // book variable
    private Book book2;                 // variable for book nr 2
    private Book book3;                 // variable for book nr 3


    @Before
    public void setUp() throws Exception {
        book = new Book("Revenge of the sith", "Star Wars", "George Lucas", "15.03.2005", "Action", "1000", "George Lucas", "5");
        book2 = new Book("Revenge of the god", "Star Wars", "George Lucas", "15.03.2009", "Action", "1000", "George Lucas", "6");
        book3 = new Book("Revenge of the house", "Star Wars", "George Lucas", "15.03.2011", "Action", "1000", "George Lucas", "1");


        bookRegistery = new Registry(); // creates a book registry
        bookRegistery.addBook(book);    // creates a book
        bookRegistery.addBook(book2);   // creates a book nr 2
        bookRegistery.addBook(book3);   // creates a book nr 3
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * tests if the add book method in registry
     */
    @Test
    public void testAddBook() {
        assertEquals(true, bookRegistery.addBook(book)); // tests if the boolean value the book registry is true
    }

    /**
     * tests if the method removeBook() in the registry class works
     */
    @Test
    public void testRemoveBook() {
        bookRegistery.removeBook("Revenge of the god"); // removes the book
        ArrayList<Book> bookArrayList = this.bookRegistery.getBookList(); // makes an ArrayList similar to the book registry
        this.bookRegistery.removeBook("Revenge of the god"); // removes the book from the book registry.
        assertFalse(bookRegistery.getBookList().contains(book2));   // tests if the bookRegistry contains the book
    }

    /**
     * tests the method listByTitle in Registry
     */
    @Test
    public void testListByTitle() {
        ArrayList<Book> bookArrayList = new ArrayList<>(); // makes a ArrayList
        bookArrayList.add(book);                            // adds the book
        bookArrayList.add(book2);                           // adds the book nr 2
        bookArrayList.add(book3);                           // adds the book nr 3
        assertEquals(bookArrayList,bookRegistery.listByTitle("revenge"));    // tests if the bookArrayList is similair to the bookRegistry

    }

    @Test
    public void testListBySeries() {
        ArrayList<Book> bookArrayList = new ArrayList<>();// makes a ArrayList
        bookArrayList.add(book);                            // adds the book
        bookArrayList.add(book2);                           // adds the book nr 2
        bookArrayList.add(book3);                           // adds the book nr 3
        assertEquals(bookArrayList,bookRegistery.listBySeries("Star wars")); // tests if the bookArrayList is similair to the bookRegistry
    }

    @Test
    public void testListByAuthor() {
        ArrayList<Book> bookArrayList = new ArrayList<>();// makes a ArrayList
        bookArrayList.add(book);                            // adds the book
        bookArrayList.add(book2);                           // adds the book
        bookArrayList.add(book3);                           // adds the book
        assertEquals(bookArrayList,bookRegistery.listByAuthor("George Lucas")); // tests if the bookArrayList is similair to the bookRegistry
    }

    @Test
    public void testListByPublisher() {
        ArrayList<Book> bookArrayList = new ArrayList<>();// makes a ArrayList
        bookArrayList.add(book);                            // adds the book
        bookArrayList.add(book2);                           // adds the book nr 2
        bookArrayList.add(book3);                           // adds the book nr 3
        assertEquals(bookArrayList,bookRegistery.listByPublisher("George Lucas")); // tests if the bookArrayList is similair to the bookRegistry
    }

    @Test
    public void testListAllBook() {
        ArrayList<Book> bookArrayList = new ArrayList<>();// makes a ArrayList
        bookArrayList.add(book);                            // adds the book
        bookArrayList.add(book2);                           // adds the book nr 2
        bookArrayList.add(book3);                           // adds the book nr 3
        assertEquals(bookArrayList,bookRegistery.listAllBook()); // tests if the bookArrayList is similair to the bookRegistry
    }
}