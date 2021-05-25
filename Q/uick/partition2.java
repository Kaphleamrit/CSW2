package Q.uick;

import java.util.Arrays;

public class partition2 {
    public static void main(String[] args) {
        int[] arr = { 23, 64, 12, 65, 23, 77, 15, 3, 11, 55 };
        int i = -1;
        int pivot = arr[6];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[6];
        arr[6] = temp;
        x`11
        System.out.println(Arrays.toString(arr));
    }

}
