import java.util.List;

import static sliding_window.SlidingWindow.findAnagrams;

public class Main {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> result = findAnagrams(s, p);
        System.out.println("Start indices of anagrams: " + result);
    }
}
