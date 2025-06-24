import java.util.List;

import static hashing.HashingMedium.groupAnagrams;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = groupAnagrams(strs);

        for (List<String> o : output) {
            System.out.println(o);
        }
    }
}
