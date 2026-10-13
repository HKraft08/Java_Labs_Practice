public class GradeCalculator {
    int mark = 80;

    void determineGrade() {
        if (mark > 100 || mark < 0) {
            System.out.println(mark + " is not a valid mark.");
        } else if (mark >= 80 && mark <= 100) {
            System.out.println("Distinction. Your mark is: " + mark);
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Merit. Your mark is: " + mark);
        } else if (mark >= 50 && mark <= 69) {
            System.out.println("Pass. Your mark is: " + mark);
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Fail. Your mark is: " + mark);
        }
    }
}
