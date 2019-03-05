import java.util.ArrayList;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 *
 * @author Yusuf
 * @version 0.1
 */

public class AppUI
{
    private int choice;
    private Scanner input;
    private Registry bookRegistry;
    private Book book;

    /**
     * Creates an instance of the ApplicationUI User interface.
     * 
     */
    public AppUI()
    {
        bookRegistry = new Registry();
        input = new Scanner(System.in);
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    public void start()
    {
        while(choice != 10)
        {
            showMenu();
            choice = input.nextInt();

            switch(choice)
            {
                case 1: //printing all books
                    listAllBook();
                    break;

                case 2: //Add new book
                    addNewBook();
                    break;

                case 3: //remove book in registry
                    removeBookInRegistry();
                    break;

                case 4: //finds book by title
                    findBookByTitle();
                    break;

                case 5: //finds book by series
                    findBookBySeries();
                    break;

                case 6: //finds book by author
                    findBookByAuthor();
                    break;

                case 7: //finds book by publisher
                    findBookByPublisher();
                    break;

                case 9: //fills registry with dummies
                    fillRegistryWithDummies();
                    break;

                case 10: //prints out a given text
                    System.out.println("\nThank you for using Application v0.1. Bye!\n");
                    choice = 10;
                    break;
            }
        }
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items.
     */
    public void showMenu()
    {
        System.out.println("1: List all books");
        System.out.println("2: Add new book");
        System.out.println("3: Remove a book from book registry");
        System.out.println("4: Find book by title");
        System.out.println("5: Find book by series");
        System.out.println("6: Find book by author");
        System.out.println("7: Find book by publisher");
        System.out.println("9: Fill registry with dummies");
        System.out.println("10: Exit");
    }

    /**
     * Lists all the books in the registry.
     * If there are no books in the registry,
     * an error message will be printed.
     */
    public void listAllBook()
    {
        ArrayList<Book> bookList = bookRegistry.listAllBook();
        if(bookList == null)
        {
            System.out.println("There is no book in registry");
            System.out.println("---------------------------------------");
        }
        else
        {
            for(Book b : bookList)
            {
                printBook(b);
            }
        }
    }

    /**
     * Finds books by series.
     * If there are no books,
     * an error message will be printed.
     * Otherwise it will print a list with all books by that series.
     */
    public void findBookBySeries()
    {
        input = new Scanner(System.in);
        System.out.println("Enter the book series: ");
        String series = input.nextLine();
        ArrayList<Book> bookList = bookRegistry.listBySeries(series);
        if(bookList == null)
        {
            System.out.println("There is no book with series: " + series);
            System.out.println("Please try different series.");
            System.out.println("---------------------------------------");
        }
        else
        {
            System.out.println("Here is the list of all books by the series " + series + ":");
            System.out.println("---------------------------------------");
            for(Book b : bookList)
            {
                printBook(b);
            }
        }
    }

    /**
     * Finds books by author.
     * If there are no books,
     * an error message will be printed.
     * Otherwise it will print a list with all books by that author.
     */
    public void findBookByAuthor()
    {
        input = new Scanner(System.in);
        System.out.println("Enter the book series: ");
        String author = input.nextLine();
        ArrayList<Book> bookList = bookRegistry.listByAuthor(author);
        if(bookList == null)
        {
            System.out.println("There is no book with author: " + author);
            System.out.println("Please try different author.");
            System.out.println("---------------------------------------");
        }
        else
        {
            System.out.println("Here is the list of all books by the author: " + author);
            System.out.println("---------------------------------------");
            for(Book b : bookList)
            {
                printBook(b);
            }
        }
    }

    /**
     * Finds books by publisher.
     * If there are no books,
     * an error message will be printed.
     * Otherwise it will print a list with all books by that publisher.
     */
    public void findBookByPublisher()
    {
        input = new Scanner(System.in);
        System.out.println("Enter the book publisher: ");
        String publisher = input.nextLine();
        ArrayList<Book> bookList = bookRegistry.listByPublisher(publisher);
        if(bookList == null)
        {
            System.out.println("There is no book with publisher: " + publisher);
            System.out.println("Please try different publisher.");
            System.out.println("---------------------------------------");
        }
        else
        {
            System.out.println("Here is the list of all books by the publisher: " + publisher);
            System.out.println("---------------------------------------");
            for(Book b : bookList)
            {
                printBook(b);
            }
        }
    }

    /**
     * This method adds a new book.
     * You will have to type everything needed to complete a book.
     */
    public void addNewBook()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("----You're now adding a book.----");

        System.out.println("Enter book title:");
        String title = input.nextLine();

        System.out.println("Enter book series:");
        String series = input.nextLine();

        System.out.println("Enter book author:");
        String author = input.nextLine();

        System.out.println("Enter book date:");
        String date = input.nextLine();

        System.out.println("Enter book genre:");
        String genre = input.nextLine();

        System.out.println("Enter book pages:");
        String pages = input.nextLine();

        System.out.println("Enter book publisher:");
        String publisher = input.nextLine();

        System.out.println("Enter book edition:");
        String edition = input.nextLine();

        book = new Book(title, series, author, date, genre, pages, publisher, edition);
        bookRegistry.addBook(book);
        System.out.println("-----You have successfully added a new book!-----");
    }

    /**
     * Removes a book in the registry.
     * If the book entered isn't in the registry,
     * an error message will be printed.
     */
    public void removeBookInRegistry()
    {
        System.out.println("Enter book title to be removed from registry: ");
        String bookRemove = input.next();
        if(book.getTitleOfBook().equals(bookRemove))
        {
            bookRegistry.removeBook(bookRemove);
            System.out.println("----" + bookRemove + " has been removed from registry!----");
        }

        else
        {
            System.out.println(bookRemove + " is not in the library. Please enter " +
                    "a different book to be removed");
            System.out.println("---------------------------------------");
        }
    }

    /**
     * Finds book by title.
     * If the book with title x is not found,
     * an error message will be printed.
     * Otherwise a list of all books with given title will be printed.
     */
    public void findBookByTitle()
    {
        input = new Scanner(System.in);
        System.out.println("Enter the book name: ");
        String title = input.nextLine();
        ArrayList<Book> bookList = bookRegistry.listByTitle(title);
        if(bookList == null)
        {
            System.out.println("There is no book with title: " + title);
            System.out.println("Please try different title.");
        }
        else
        {
            System.out.println("Here is the list of all books by the name " + title + ":");
            System.out.println("---------------------------------------");
            for(Book b : bookList)
            {
                printBook(b);
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
     * Fills registry with dummies.
     */
    public void fillRegistryWithDummies()
    {
        bookRegistry.addBook(book = new Book("Yusuf the man", "Harmankaya", "Yusuf Harmanakya", "123", "Comedy", "123", "Pearson", "First edition"));
        bookRegistry.addBook(book = new Book("Yusuf the dude", "Harmankaya", "Yusuf Harmanakya", "123", "Comedy", "123", "Pearson", "First edition"));
        bookRegistry.addBook(book = new Book("Yusuf the myth", "Harmankaya", "Yusuf Harmanakya", "123", "Comedy", "123", "Pearson", "First edition"));
    }
}
