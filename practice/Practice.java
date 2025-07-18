package practice;

import java.util.HashMap;

public class Practice {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return c;
            }
            hashMap.put(c, hashMap.get(c) - 1);
        }

        System.out.println(hashMap);

        return ' ';
    }
}
