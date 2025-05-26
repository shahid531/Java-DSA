import java.util.Arrays;

import static array.ArrayMedium.productExceptSelf;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(productExceptSelf(arr1)));
    }
}
