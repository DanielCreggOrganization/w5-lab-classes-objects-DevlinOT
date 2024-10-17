package ie.atu.classesandobjects;

public class Student {
    // static field
    static int studentCount = 0;


    // instance variables
    String name;
    int age;
    int id;
    boolean register;

    public Student() {
        // Default constructor
        this("null", 00000, 0, false);
       
    }

    public Student(String name, int age, int id, boolean register) {
         // Parameterized constructor
        this.name = name;
        this.id = id;
        this.age = age;
        this.register = register;
        studentCount ++;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: "+ this.id);
        System.out.println("Age: "+ this.age);
        System.out.println("Registered: " + this.register);
    }
    // Static Method (class method)
  public static int getStudentCount() {
    return studentCount;
  }

}
