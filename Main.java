import static array.ArrayMedium.printMatrix;
import static array.ArrayMedium.setZeroes;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(arr1);
        printMatrix(arr1);
    }
}
