package extra;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int temp;
        boolean isSorted;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            isSorted = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;

                }
            }
            if (isSorted)
                break;
        }
        for (int i : arr)
            System.out.println(i);
    }
}