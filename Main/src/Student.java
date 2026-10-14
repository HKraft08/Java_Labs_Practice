public class Student {
    String name;
    String studentNumber;
    double mark;

    Student(String name, String studentNumber, double mark) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println(("Student number: " + this.studentNumber));
        System.out.println("Mark: " + this.mark);
    }

    void hasPassed() {
        if (this.mark >= 50) {
            System.out.println("Passed: True");
        } else {
            System.out.println("Passed: False");
        }
    }

}
