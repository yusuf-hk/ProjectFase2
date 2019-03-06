import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    Book book;


    @Before
    public void setUp() throws Exception {
        book = new Book("Revenge of the sith", "Star Wars", "George Lucas", "15.03.2005", "Action", "1000", "George Lucas", "edition");
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * tests the method getTitleOfBook() in the class Book
     */
    @Test
    public void testGetTitleOfBook() {
        assertEquals("Revenge of the sith", book.getTitleOfBook()); //tests if string is equal to getTitleOfBook
    }

    /**
     * tests the method getSeriesOfBook() in the class Book
     */
    @Test
    public void testGetSeriesOfBook() {
        assertEquals("Star Wars", book.getSeriesOfBook()); //tests if string is equal to getSeriesOfBook
    }

    /**
     * tests the method getAuthorOfBook() in the class Book
     */
    @Test
    public void testGetAuthorOfBook() {
        assertEquals("George Lucas", book.getAuthorOfBook());//tests if string is equal to getAuthorOfBook
    }

    /**
     * tests the method getDateOfBook() in the class Book
     */
    @Test
    public void testGetDateOfBook() {
        assertEquals("15.03.2005", book.getDateOfBook());//tests if string is equal to getDaeOfBook
    }

    /**
     * tests the method getPagesOfBook() in the class Book
     */
    @Test
    public void testGetPagesOfBook() {
        assertEquals("1000", book.getPagesOfBook()); //tests if string is equal to getPagesOfBook
    }

    /**
     * tests the method getGenreOfBook() in the class Book
     */
    @Test
    public void testGetGenreOfBook() {
        assertEquals("Action", book.getGenreOfBook());//tests if string is equal to getGenreOfBook
    }

    /**
     * tests the method getPublisherOfBook() in the class Book
     */
    @Test
    public void testGetPublisherOfBook(){
        assertEquals("George Lucas", book.getPublisherOfBook());//tests if string is equal to getPublisherOfBook
    }
}