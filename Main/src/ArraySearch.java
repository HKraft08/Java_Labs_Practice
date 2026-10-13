import java.util.ArrayList;

public class ArraySearch {
    int[] numbers = {34, 56, 78, 34, 90, 98};

    ArrayList<Integer> targetIndex = new ArrayList<>();

    void findTargetIndex() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 34) {
                targetIndex.add(i);
            }
        }

        System.out.println("Indexes with the target value of 34: " + targetIndex);
    }

}
