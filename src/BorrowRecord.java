// BorrowRecord class to hold transaction details
public class BorrowRecord {
    private String studentName;
    private String bookTitle;
    private String borrowingStatus;

    // Constructor
    public BorrowRecord(String studentName, String bookTitle, String borrowingStatus) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        this.borrowingStatus = borrowingStatus;
    }

    // Method to display the borrowing record
    public void displayRecord() {
        System.out.println("Borrow Record");
        System.out.println("Student: " + studentName);
        System.out.println("Book: " + bookTitle);
        System.out.println("Status: " + borrowingStatus);
    }
}