package extra;

import java.util.Arrays;

public class Lookup {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = parity(i);
        }

        System.out.println(Arrays.toString(arr));

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

// wap to insert elements into an array and if number of elements is equal size
// increase the size of the array