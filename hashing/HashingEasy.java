package hashing;

import java.util.HashMap;

public class HashingEasy {
    // https://leetcode.com/problems/two-sum/description/
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cm = target - nums[i];
            if (hashMap.containsKey(cm)) {
                System.out.println(hashMap);
                return new int[]{hashMap.get(cm), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
