package sliding_window;

import java.util.*;

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

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
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

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26]; // frequency map for s1
        int[] s2Count = new int[26]; // frequency map for s2 sliding window

        // Fill frequency for s1 and first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Compare the first window
        if (Arrays.equals(s1Count, s2Count)) return true;

        // Slide the window through s2
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++; // add new character
            s2Count[s2.charAt(i - s1.length()) - 'a']--; // remove old character

            if (Arrays.equals(s1Count, s2Count)) return true;
        }

        return false;
    }

    // https://leetcode.com/problems/minimum-size-subarray-sum/description/
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Integer.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    // https://leetcode.com/problems/longest-repeating-character-replacement/description/
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // If window is invalid, shrink from the left
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        // Count frequency of characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // Sliding window
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            // If window size > p length, remove leftmost character
            if (i >= p.length()) {
                window[s.charAt(i - p.length()) - 'a']--;
            }

            // Compare window with p
            if (Arrays.equals(pCount, window)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

}
