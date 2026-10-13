public class StudentMarks {
    int[] marks = {56, 97, 71, 65, 83};

    void displayMarks() {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
            total = total + marks[i];
        }

        int average = total/marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
