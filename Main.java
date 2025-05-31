import static array.ArrayMedium.*;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        System.out.println(minSubArrayLen(target, arr1));
    }
}
