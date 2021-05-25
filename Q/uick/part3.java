package Q.uick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class part3 {

    // O(n^2)
    // public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1,
    // 2, 2, 0, 2, 1, 0, 2, 2, 1, 0));
    // System.out.println(list);
    // int pivot = list.get(3);
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(j) < pivot) {
    // Collections.swap(list, i, j);
    // }
    // }
    // }
    // for (int i = list.size() - 1; i > 0; i--) {
    // for (int j = i; j > 0; j--) {
    // if (list.get(j) > pivot) {
    // Collections.swap(list, i, j);
    // }
    // }
    // }
    // System.out.println(list);
    // }

    // O(n)
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 1, 2, 2, 0, 2, 1, 0, 2, 2, 1, 0));
        int low = 0, mid = 0, high = list.size() - 1;

        System.out.println(list);
        while (mid <= high) {
            if (list.get(mid) == 0)
                Collections.swap(list, mid++, low++);
            else if (list.get(mid) == 1)
                mid++;
            else
                Collections.swap(list, mid, high--);
        }

        System.out.println(list);

    }
}
