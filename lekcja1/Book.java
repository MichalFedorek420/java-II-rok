package lekcja1;

public class Book {
    private int number_of_pages;
    private String title;
    private String author;

    public Book(int number_of_pages, String title, String author){
        this.number_of_pages = number_of_pages;
        this.title = title;
        this.author = author;
    }

    public void pageTurning(){
        System.out.println("Next page...");
    }

    public void openBook(){
        System.out.println("Opening the book...");
    }

    public void closingBook(){
        System.out.println("Closing the book...");
    }
}
