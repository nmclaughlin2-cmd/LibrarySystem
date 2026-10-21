// Starting point of the application
public class Main {
    public static void main(String[] args) {
        System.out.println("LIBRARY BORROWING SYSTEM\n");

        // 1. Create a Student object (John Smith)
        Student student1 = new Student("John Smith", "S101");
        student1.displayInfo();
        System.out.println();

        // 2. Create a Book object (Java Programming)
        Book book = new Book("Java Programming", "James Gosling", true);
        book.displayInfo();
        System.out.println();

        // 3. Create a Library object
        Library library = new Library();

        // 4. Process the borrowing request
        System.out.println("Processing borrowing request...\n");

        // 5. Borrow the book and display results
        BorrowRecord record = library.borrowBook(student1, book);
        if (record != null) {
            record.displayRecord();
            System.out.println();
        }

        // Display updated book availability
        System.out.println("Book Available: " + book.isAvailable() + "\n");

        // 6. Create another student (Mary Johnson)
        Student student2 = new Student("Mary Johnson", "S102");

        // 7 & 8. Attempt to borrow the same book again (fails)
        System.out.println("Second borrowing attempt...\n");
        library.borrowBook(student2, book);
    }
}