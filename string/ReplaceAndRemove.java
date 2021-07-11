import java.util.Arrays;

public class ReplaceAndRemove {
    public static void main(String[] args) {
        int effSize = 7;
        char[] A = new char[effSize];
        A[0] = 'a';
        A[1] = 'b';
        A[2] = 'a';
        A[3] = 'a';
        A[4] = 'c';
        Arrays.toString(replaceAndRemove(A, 5));
        System.out.println(A);
    }

    static char[] replaceAndRemove(char[] arr, int n) {
        int flagIndex = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 'b')
                arr[flagIndex++] = arr[i];

            if (arr[i] == 'a')
                counter++;
        }

        int currIndex = flagIndex - 1;
        flagIndex = currIndex + counter;

        for (int i = currIndex; i >= 0; i--) {
            if (arr[i] == 'a') {
                arr[flagIndex--] = 'd';
                arr[flagIndex--] = 'd';
            } else
                arr[flagIndex--] = arr[i];
        }

        return arr;
    }

}
