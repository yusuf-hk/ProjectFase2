import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * hei
 */

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RegistryTest {
    private Registry bookRegistery;
    private Book book;
    private Book book2;
    private Book book3;


    @Before
    public void setUp() throws Exception {
        book = new Book("Revenge of the sith", "Star Wars", "George Lucas", "15.03.2005", "Action", "1000", "George Lucas");
        book2 = new Book("Revenge of the god", "Star Wars", "George Lucas", "15.03.2009", "Action", "1000", "George Lucas");
        book3 = new Book("Revenge of the house", "Star Wars", "George Lucas", "15.03.2011", "Action", "1000", "George Lucas");


        bookRegistery = new Registry();
        bookRegistery.addBook(book2);
        bookRegistery.addBook(book3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddBook() {
        assertEquals(true, bookRegistery.addBook(book));
    }

    @Test
    public void testRemoveBook() {
        bookRegistery.removeBook("Revenge of the god");

        ArrayList<Book> bookArrayList = this.bookRegistery.getBookList();
        this.bookRegistery.removeBook("Revenge of the god");
        assertFalse(bookRegistery.getBookList().contains(book2));


    }

    @Test
    public void testListByTitle() {
        ArrayList<Book> bookArrayList = this.bookRegistery.getBookList();
        this.bookRegistery.listByTitle(String "Revenge of the house");
        assertEquals(,testListByTitle(book3));

    }

    @Test
    public void testListBySeries() {
    }

    @Test
    public void testListByAuthor() {
    }

    @Test
    public void testListByPublisher() {
    }

    @Test
    public void testListAllBook() {
    }
}