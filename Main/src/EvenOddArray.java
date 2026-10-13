import java.util.ArrayList;

public class EvenOddArray {
    int[] numbers = {3, 5, 8, 16, 65};

    void splitEvenAndOdd() {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                even.add(numbers[i]);
            } else {
                odd.add(numbers[i]);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
