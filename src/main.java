public class main
{
    public static void main(String[] args)
    {
        Book harryPotter1 = new Book("Harry Potter og Mysteriekammeret", "Harry Potter", "Mathias Forberg", "01.01.2000", "Horror", 580, "Keed", "Second edition");
        Book harryPotter2 = new Book("Harry Potter og de vises stein", "Harry Potter", "Mathias Forberg", "01.01.2001", "Horror", 581, "Keed", "First edition");
        Book harryPotter3 = new Book("Harry Potter og fangen fra Azkaban", "Harry Potter", "Mathias Forberg", "01.01.2002", "Horror", 582, "Keed", "Third edition");
        Registry bookList = new Registry();
        bookList.addBook(harryPotter1);
        bookList.addBook(harryPotter2);
        bookList.addBook(harryPotter3);
        bookList.listByTitle("harry potter");
    }
}