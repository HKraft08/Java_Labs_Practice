import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class ArrayStatistics {
    int[] numbers = {65, 68, 73, 84, 32, 16};

    void arrayAnalysis() {
        System.out.println("Maximum: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("Minimum: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("Number of elements: " + numbers.length);

        int counter = 0;

        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] >= 50) {
                counter++;
            }
        }

        System.out.println("Amount of elements greater than or equal to 50: " + counter);
    }
}
