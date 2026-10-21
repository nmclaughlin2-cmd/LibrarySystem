// Library class to handle borrowing logic
public class Library {

    // Method to borrow a book
    public BorrowRecord borrowBook(Student student, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed successfully!\n");
            return new BorrowRecord(student.getName(), book.getTitle(), "Borrowed");
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
            return null;
        }
    }

    // Bonus challenge method to return a book
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("Book returned successfully!");
    }
}