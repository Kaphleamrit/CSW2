package extra;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 1, 6, 4, 3, 7, 43, 67 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) { // go to start of the array until number in left is greater than number on
                                             // the right
                arr[j + 1] = arr[j]; // shifting to make room for the key
                j--; // j's value gives the position after which the key should be inserted

            }
            arr[j + 1] = key;

        }

        for (int i : arr)
            System.out.println(i);
    }

}
