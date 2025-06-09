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

}
