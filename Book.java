public class Book {
    // Private data members
    private String title;
    private String author;
    private int pages;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.pages = 0;
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: $" + price);
        System.out.println("--------------------------");
    }

    // Method to update the price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}
