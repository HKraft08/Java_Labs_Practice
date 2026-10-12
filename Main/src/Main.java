import java.util.stream.StreamSupport;

public class Main {
    public static void main (String[] args) {

        //Exercise 1.1: Student details
        StudentDetails student = new StudentDetails();

        System.out.println("Student name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Average Mark: " + student.averageMark);
        System.out.println("Registered: " + student.isRegistered);
    }
}
