package ie.atu.classesandobjects;

public class Main {
public static void main(String[] args) {
    // Creating a Student object
    Student student = new Student();
    Student student2 = new Student("Devlin",345363, 20, true);
    Student student3 = new Student("John",464576, 45, false);
    Book book = new Book("Effective Java", "Joshua Bloch", 45.99);
    // Displaying the student's information
    student.displayInfo();
    System.out.println("\n");
    student2.displayInfo();
    System.out.println("\n");
    student3.displayInfo();
    System.out.println("\n");
    System.out.println(book);
    System.out.println("\n");

    System.out.println("Total Students: " + Student.getStudentCount());
}
}