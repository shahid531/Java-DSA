import static sliding_window.SlidingWindow.minSubArrayLen;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr1));
    }
}
