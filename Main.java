import static hashing.HashingEasy.countWords;

public class Main {
    public static void main(String[] args) {
        String[] words1 = {"a", "ab"};
        String[] words2 = {"a", "a", "a", "ab"};

        System.out.println(countWords(words1, words2));
    }
}
