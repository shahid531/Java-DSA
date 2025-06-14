import java.util.Arrays;

import static hashing.HashingEasy.twoSum;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr1, target)));
    }
}
