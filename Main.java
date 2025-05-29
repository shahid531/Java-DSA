import java.util.List;

import static array.ArrayMedium.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0};
        List<List<Integer>> result = threeSum(arr1);
        for (List<Integer> li : result) {
            System.out.println(li);
        }
    }
}
