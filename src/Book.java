/**
 * Represents a book. information of the book
 *
 * @author Yusuf Harmankaya
 * @version 0.1
 */
public class Book
{
    //The title of the book. For example "Narnia"
    private String titleOfBook;

    private String seriesOfBook;

    //The name of the author who wrote the book. For example "Ola Nordmann"
    private String authorOfBook;

    //The date when the book was published(DD/MM/YYYY). For example "01.01.2000"
    private String dateOfBook;

    //The genre of the book. For example "Horror", "Comedy" etc.
    private String genreOfBook;

    //Number of pages the book contains. For example "423"
    private int pagesOfBook;

    //The publisher of the book. For example "Aschehoug"
    private String publisherOfBook;

    //What edition of book
    private String editionOfBook;

    /**
     * Constructor for objects of class Book.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param date the date when the book was made.
     * @param genre The genre of the book.
     * @param pages Number of pages the book contains.
     * @param publisher The publisher of the book.
     * @param edition The edition of the book.
     */
    public Book(String title, String serie, String author, String date, String genre, int pages, String publisher, String edition)
    {
        this.titleOfBook = title;
        this.seriesOfBook = serie;
        this.authorOfBook = author;
        this.dateOfBook = date;
        this.genreOfBook = genre;
        this.pagesOfBook = pages;
        this.publisherOfBook = publisher;
        this.editionOfBook = edition;
    }

    /**
     * Returns the title of the book
     * @return the title of the book
     */
    public String getTitleOfBook()
    {
        return this.titleOfBook;
    }

    /**
     * Returns the series of the book series
     * @return the series of the book series
     */
    public String getSeriesOfBook()
    {
        return this.seriesOfBook;
    }

    /**
     * Returns the author of the book
     * @return the author of the book, with first name and last name
     */
    public String getAuthorOfBook()
    {
        return this.authorOfBook;
    }

    /**
     * Returns the date when the book was made
     * @return the date when the book was made, DD/MM/YYYY
     */
    public String getDateOfBook()
    {
        return this.dateOfBook;
    }

    /**
     * Returns the genre of the book
     * @return the genre of the book
     */
    public String getGenreOfBook()
    {
        return this.genreOfBook;
    }

    /**
     * Returns number of the pages the book has
     * @return
     */
    public int getPagesOfBook()
    {
        return this.pagesOfBook;
    }

    /**
     * Returns the publisher of the book
     * @return the publisher of the book
     */
    public String getPublisherOfBook()
    {
        return this.publisherOfBook;
    }

    /**
     * Returns the edition of the book
     * @return the edition of the book
     */
    public String getEditionOfBook()
    {
        return this.editionOfBook;
    }

    /**
     * Changes the edition of the book
     * @param edition the latest edition
     * @return newest edition of the book
     */
    public String setEditionOfBook(String edition)
    {
        this.editionOfBook = edition;
        return edition;
    }

}
