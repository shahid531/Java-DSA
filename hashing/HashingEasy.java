package hashing;

import java.util.Arrays;
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

    // https://leetcode.com/problems/valid-anagram/description/
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(hashMap);

        for (char c : t.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) return false;
            hashMap.put(c, hashMap.get(c) - 1);
        }

        System.out.println(hashMap);

        return true;
    }
}
