import static hashing.HashingEasy.findTheDifference;

public class Main {
    public static void main(String[] args) {
        String s = "aabbcc";
        String t = "abcbacc";
        System.out.println(findTheDifference(s, t));
    }
}
