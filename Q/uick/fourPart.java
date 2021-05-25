package Q.uick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class fourPart {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 0, 2, 1, -1, -2, -1, 0, 3, 3, 2, 1, 0, 1, 3, 1, 2, 3, 1, 0));

        int front = 0, mid = 0, end = list.size() - 1;
        int pivot = list.get(0);

        while (mid <= end) {
            if (list.get(mid) < pivot)
                Collections.swap(list, front++, mid++);
            else if (list.get(mid) == pivot)
                mid++;
            else
                Collections.swap(list, mid, end--);
        }
        System.out.println(list);
    }

}
