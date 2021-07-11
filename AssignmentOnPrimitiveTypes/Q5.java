package AssignmentOnPrimitiveTypes;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {

        int[] a = new int[(int) Math.pow(2, 4)];
        int n = a.length;

        for (int i = 0; i < n; i++) {
            a[i] = parity(i);
        }

        System.out.println(Arrays.toString(a));
    }

    public static int parity(int n) {
        int counter = 0;

        while (n != 0) {
            int bit = n & 1;
            if (bit == 1)
                counter++;
            n >>>= 1;
        }
        return counter;
    }

}
