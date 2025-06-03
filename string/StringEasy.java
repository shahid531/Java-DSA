package string;

import java.util.Arrays;

public class StringEasy {

    // https://leetcode.com/problems/valid-anagram/description/
    public static boolean isAnagram(String s, String t) {
        // O(n log n)
        String[] s1 = s.split("");
        String[] s2 = t.split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        String out1 = String.join("", s1);
        String out2 = String.join("", s2);
        return out1.equals(out2);
    }

    // https://leetcode.com/problems/valid-palindrome/description/
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                builder1.append(s.charAt(i));
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                builder2.append(s.charAt(i));
            }
        }
        return builder1.toString().contentEquals(builder2);
    }

    // https://leetcode.com/problems/reverse-string/description/
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - i - 1];
            s[s.length - i - 1] = s[i];
            s[i] = temp;
        }
    }

    // https://leetcode.com/problems/first-unique-character-in-a-string/description/
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                }
            }
            if (count == 0) {
                return i;
            }
        }
        return -1;
    }
}
