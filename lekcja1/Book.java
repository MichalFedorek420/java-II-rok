package lekcja1;

public class Book {
    private int number_of_pages;
    private String title;
    private String author;

    public Book(int number_of_pages, String title, String author) {
        this.number_of_pages = number_of_pages;
        this.title = title;
        this.author = author;
    }

    public void page_turning(){
        System.out.println("Next page...");
    }

    public void open_book(){
        System.out.println("Opening the book...");
    }

    public void closing_book(){
        System.out.println("Closing the book...");
    }
}
