// Book class to store book details and availability status
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Methods to retrieve book information
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to update book availability
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book Available: " + isAvailable);
    }
}