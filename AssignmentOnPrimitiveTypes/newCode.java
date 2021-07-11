
package AssignmentOnPrimitiveTypes;

import java.util.Arrays;

public class newCode {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(evenOdd(arr)));
    }

    public static int[] evenOdd(int[] A) {
        int nextEven = 0, nextOdd = A.length - 1;

        while (nextEven < nextOdd) {

            if (A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
        return A;
    }
}
