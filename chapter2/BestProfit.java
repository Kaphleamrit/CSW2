import java.util.ArrayList;
import java.util.Arrays;

public class BestProfit {
    public static void main(String[] args) {

        // int[] arr = { 4, 3, 5, 6, 7, 5, 6, 7, 3 };

        // int[] temp = arr.clone();

        // for (int i = arr.length - 1; i > 0; i--) {
        // temp[i] = Math.max(temp[i], arr[i - 1]);
        // System.out.println(Arrays.toString(temp));
        // }
        // int max = temp[0] - arr[0];
        // for (int i = 1; i < arr.length - 1; i++) {
        // if (temp[i] - arr[i] > max)
        // max = temp[i] - arr[i];
        // }
        // System.out.println(max);

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 4, 2, 5, 7));
        int minSoFar = p.get(0);
        int maxProfit = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            minSoFar = Math.min(minSoFar, list.get(i));
            maxProfit = Math.max(maxProfit, a.get(i) - minSoFar);
        }

        System.out.println(maxProfit);

    }

}
