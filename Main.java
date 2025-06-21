import java.util.Arrays;

import static hashing.HashingEasy.findWords;

public class Main {
    public static void main(String[] args) {
        String[] s = {"Hello", "Alaska", "Dad", "Peace"};

        System.out.println(Arrays.toString(findWords(s)));
    }
}
