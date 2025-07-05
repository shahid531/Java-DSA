import java.util.List;

import static two_pointer.TwoPointer.threeSum;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-1, 0, 1, 2, -1, -4};
        threeSum(arr1);

        List<List<Integer>> triplets = threeSum(arr1);
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
