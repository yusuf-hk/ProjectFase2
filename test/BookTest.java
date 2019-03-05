import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("Revenge of the sith", "Star Wars", "George Lucas", "15.03.2005", "Action", "1000", "George Lucas");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetTitleOfBook() {
        assertEquals("Revenge of the sith", book.getTitleOfBook());

    }

    @Test
    public void testGetSeriesOfBook() {
        assertEquals("Star Wars", book.getSeriesOfBook());

    }

    @Test
    public void testGetAuthorOfBook() {
        assertEquals("George Lucas", book.getAuthorOfBook());
    }

    @Test
    public void testGetDateOfBook() {
        assertEquals("15.03.2005", book.getDateOfBook());
    }

    @Test
    public void testGetPagesOfBook() {
        assertEquals("1000", book.getPagesOfBook());
    }

    @Test
    public void testGetGenreOfBook() {
        assertEquals("Action", book.getGenreOfBook());
    }

    @Test
    public void testGetPublisherOfBook(){
        assertEquals("George Lucas", book.getPublisherOfBook());
    }
}