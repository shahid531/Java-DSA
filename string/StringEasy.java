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

    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    // https://leetcode.com/problems/longest-common-prefix/description/
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return prefix;
                }
            }
            prefix += currentChar;
        }
        return prefix;
    }

    // https://leetcode.com/problems/to-lower-case/description/
    public static String toLowerCase(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                builder.append((char) (ch + 32));
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
