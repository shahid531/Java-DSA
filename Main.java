import java.util.Arrays;

import static array.ArrayEasy.intersect;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }
}
