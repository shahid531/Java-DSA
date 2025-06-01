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
        String out1 = String.join("",s1);
        String out2 = String.join("",s2);
        return out1.equals(out2);
    }
}
