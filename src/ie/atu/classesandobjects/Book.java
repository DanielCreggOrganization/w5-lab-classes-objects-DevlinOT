package ie.atu.classesandobjects;

public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;   // Initialize title
        this.author = author; // Initialize author
        this.price = price;   // Initialize price
    }

    // Override toString method for a user-friendly representation
    @Override
    public String toString() {
        return String.format("Book{title="+title+", author="+author+", price="+price+"}");
    }
}
