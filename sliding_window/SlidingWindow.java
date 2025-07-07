package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (characterSet.contains(ch)) {
                characterSet.remove(s.charAt(left));
                left++;
            }
            characterSet.add(ch);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
