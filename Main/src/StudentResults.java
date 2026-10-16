public class StudentResults {

    int studentNumber;
    String studentName;
    double[] marks;

    static double highestAverage = 0;
    static String studentWithHighestAverage = "";
    static int countPassed = 0;

    StudentResults(int studentNumber, String studentName, double[] marks) {

        if (!validateMarks(marks)) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    boolean validateMarks( double[] marks) {
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 0 || marks[i] > 100) {
                return false;
            }

        }
        return true;
    }

    void average() {

        double total = 0;

        for (int i = 0; i < this.marks.length; i++) {
            total = total + this.marks[i];
        }

        double average = total/this.marks.length;

        System.out.println("\nAverage mark: " + average);

        if (average >= 50) {

            System.out.println("You have passed.");
            countPassed++;

        } else {
            System.out.println("You have failed");
        }

        if (average > highestAverage) {
            highestAverage = average;
            studentWithHighestAverage = this.studentName;
        }
    }


    void displayDetails() {
        System.out.println("Student number: " + this.studentNumber);
        System.out.println("Student name: " + this.studentName);
        System.out.print("Student marks: ");

        for (int i = 0; i < this.marks.length; i++) {
            System.out.print(this.marks[i] + " ");
        }
    }

    void countPassed() {

        System.out.println("Number of students that passed: " + countPassed);
    }

    void highestAverage() {

        System.out.println("Student with highest average: " + studentWithHighestAverage + " with " +
                highestAverage);
    }

}