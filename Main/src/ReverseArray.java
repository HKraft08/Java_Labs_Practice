import java.util.Arrays;

public class ReverseArray {
    int[] numbers = {1, 2, 3, 4, 5, 6};

    int arrStart = 0;
    int arrEnd = numbers.length - 1;

    void reverseArray() {

        System.out.println("Original array: " + Arrays.toString(numbers));

        while (arrEnd > arrStart) {

            int holder = numbers[arrStart];
            numbers[arrStart] = numbers[arrEnd];
            numbers[arrEnd] = holder;

            arrStart++;
            arrEnd--;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}
