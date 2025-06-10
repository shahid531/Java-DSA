package string;

public class StringMedium {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (allUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }
        return maxLength;
    }

    public static boolean allUnique(String s, int start, int end) {
        boolean[] chars = new boolean[128];
        for (int i = start; i < end; i++) {
            if (chars[s.charAt(i)]) {
                return false;
            }
            chars[s.charAt(i)] = true;
        }
        return true;
    }

    private static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // https://leetcode.com/problems/longest-palindromic-substring/description/
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int maxLength = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && (j - i + 1 > maxLength)) {
                    maxLength = j - i + 1;
                    longest = s.substring(i, j + 1);
                }
            }
        }

        return longest;
    }

}
