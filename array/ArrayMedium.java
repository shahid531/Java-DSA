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

    // https://leetcode.com/problems/top-k-frequent-elements/
    public static int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[nums.length];
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxIndex = -1;
            for (int j = 0; j < nums.length; j++) {
                if (!visited[j] && freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != -1) {
                result[i] = nums[maxIndex];
                visited[maxIndex] = true;
            }
        }
        return result;
    }
}
