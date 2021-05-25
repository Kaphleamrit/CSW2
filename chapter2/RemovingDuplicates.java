import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * RemovingDuplicates
 */
public class RemovingDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 3, 5, 3, 56, 2, 3, 4, 3, 2, 4, 2, 3));
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i + 1);
                i--;
            }
        }
        System.out.println(list);
    }
}

// implement a function that takes a array and a key and update the array with
// all occurances of key have been removed and remaining elements are shifted to
// the left