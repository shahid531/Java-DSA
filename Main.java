import java.util.Arrays;

import static array.ArrayEasy.twoSum;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(arr1, target)));
    }
}
