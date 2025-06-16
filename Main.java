import java.util.Arrays;

import static hashing.HashingEasy.intersect;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
