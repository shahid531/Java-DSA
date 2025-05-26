package array;

import java.util.Arrays;

public class ArrayMedium {

    // https://leetcode.com/problems/product-of-array-except-self/
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
