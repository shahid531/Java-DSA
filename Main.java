import java.util.List;

import static string.StringMedium.*;

public class Main {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = groupAnagrams(str);

        for (List<String> group : groups) {
            System.out.println(group);
        }
    }
}
