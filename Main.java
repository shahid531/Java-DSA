import static sliding_window.SlidingWindow.findMaxAverage;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(arr1, k));
    }
}
