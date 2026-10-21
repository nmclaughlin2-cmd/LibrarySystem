// Student class to store student details
public class Student {
    private String name;
    private String studentId;

    // Constructor to initialize variables
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Methods to retrieve student information
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Student ID: " + studentId);
    }
}