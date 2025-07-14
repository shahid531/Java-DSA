package practice;

import java.util.HashSet;

public class Practice {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) return false;

            set.add(n);
            n = sumOfDigitsSquares(n);
        }
        return true;
    }

    public static int sumOfDigitsSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
