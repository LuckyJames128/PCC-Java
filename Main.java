public class Main {
    public static void main(String[] args) {
        // Create a Book object using the default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Information:");
        defaultBook.displayBookInfo();

        // Create a Book object using the parameterized constructor
        Book customBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 10.99);
        System.out.println("Custom Book Information:");
        customBook.displayBookInfo();

        // Update the price and display updated info
        customBook.updatePrice(12.99);
        System.out.println("Updated Book Information:");
        customBook.displayBookInfo();
    }
}
