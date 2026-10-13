public class PassOrFail {
    int mark = 60;

    void validMark() {
        if (mark > 100) {
            System.out.println(mark + " is not a valid mark.");
        } else if (mark < 0) {
            System.out.println(mark + " is not a valid mark");
        } else if (mark >= 50) {
            System.out.println("Pass. Your mark is: " + mark);
        } else {
            System.out.println("Fail. Your mark is: " + mark);
        }
    }
}
