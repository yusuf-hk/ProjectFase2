import java.util.ArrayList;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user. test
 *
 * @author Yusuf
 * @version 0.1
 */

public class AppUI
{
    private int choice;
    private Scanner input;
    private Registry bookRegistry;

    public AppUI()
    {
        bookRegistry = new Registry();
        input = new Scanner(System.in);
    }

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

                case 4:
                    findBookByTitle();
                    break;

                case 5:
                    findBookBySeries();
                    break;

                case 6:
                    findBookByAuthor();
                    break;

                case 7:
                    findBookByPublisher();
                    break;

                case 9:
                    fillRegistryWithDummies();
                    break;

                case 10:
                    System.out.println("\nThank you for using Application v0.1. Bye!\n");
                    choice = 10;
                    break;
            }
        }
    }

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

        Book book = new Book(title, series, author, date, genre, pages, publisher, edition);
        bookRegistry.addBook(book);
        System.out.println("-----You have successfully added a new book!-----");
    }

    public void removeBookInRegistry()
    {
        System.out.println("Enter book title to be removed from registry: ");
        String bookRemove = input.next();
        Book b = bookRegistry.removeBook(bookRemove);
            if(b == null)
            {
                System.out.println("----" + bookRemove + " is not found in registry, " +
                        "please enter different book title----");
            }
            else
            {
                System.out.println("----" + bookRemove + " has been removed from registry!----");
            }
    }

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

    public void fillRegistryWithDummies()
    {
        bookRegistry.addBook(new Book("Yusuf the man", "Harmankaya", "Yusuf Harmanakya", "123", "Comedy", "123", "Pearson", "First edition"));
        bookRegistry.addBook(new Book("Yusuf the dude", "Harmankaya", "Yusuf Harmanakya", "123", "Comedy", "123", "Pearson", "First edition"));
        bookRegistry.addBook(new Book("mathias", "Harmankaya", "Yusuf Harmanakya", "123", "Comedy", "123", "Pearson", "First edition"));
    }
}
