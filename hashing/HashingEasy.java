package hashing;

import java.util.*;

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

        for (char c : t.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) return false;
            hashMap.put(c, hashMap.get(c) - 1);
        }

        return true;
    }

    // https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hashMap.put(nums1[i], hashMap.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.getOrDefault(nums2[i], 0) > 0) {
                list.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // https://leetcode.com/problems/first-unique-character-in-a-string/description/
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    // https://leetcode.com/problems/happy-number/description/
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) return false;

            set.add(n);
            n = sumOfDigitsSquares(n);
        }
        return true;
    }

    public static int sumOfDigitsSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // https://leetcode.com/problems/isomorphic-strings/description/
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> t1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (s1.containsKey(c1)) {
                if (s1.get(c1) != c2) {
                    return false;
                }
            } else {
                s1.put(c1, c2);
            }
            System.out.println(s1);
            if (t1.containsKey(c2)) {
                if (t1.get(c2) != c1) {
                    return false;
                }
            } else {
                t1.put(c2, c1);
            }
            System.out.println(t1);
        }
        return true;
    }

    // https://leetcode.com/problems/find-the-difference/description/
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

    public static char findTheDifference1(String s, String t) {
        int[] count = new int[26];

        // Count each character in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Subtract counts using characters from t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return c; // This is the extra character
            }
        }

        return ' '; // Should never reach here if input is valid
    }

    // https://leetcode.com/problems/keyboard-row/description/
    public static String[] findWords(String[] words) {
        Map<Character, Integer> charRowMap = new HashMap<>();
        String[] rows = {
                "qwertyuiop",
                "asdfghjkl",
                "zxcvbnm"
        };
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                charRowMap.put(c, i);
            }
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            boolean sameRow = true;
            int row = charRowMap.get(lower.charAt(0));

            for (int i = 1; i < lower.length(); i++) {
                if (charRowMap.get(lower.charAt(i)) != row) {
                    sameRow = false;
                    break;
                }
            }
            if (sameRow) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

}
