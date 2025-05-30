package array;

import java.util.*;

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

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (duplicate.contains(nums[i])) continue;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 1) {
                duplicate.add(nums[i]);
            }
        }
        return duplicate;
    }

    // https://leetcode.com/problems/set-matrix-zeroes/
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRow = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRow[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // https://leetcode.com/problems/subarray-sum-equals-k/description/
    public static int subarraySum(int[] nums, int k) {
        int countData = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];
                if (count == k) {
                    countData++;
                }
            }
        }
        return countData;
    }

    // https://leetcode.com/problems/3sum/description/
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    // https://leetcode.com/problems/sort-colors/description/
    public static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        for (int i = 0; i < zero; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < one; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < two; i++) {
            nums[index++] = 2;
        }
    }
}
