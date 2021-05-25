import java.util.ArrayList;
import java.util.Arrays;

public class dynamicAdding {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 9, 9, 9));

        int n = list.size() - 1;
        list.set(n, list.get(n) + 1);

        for (int i = n; i > 0; i--) {
            if (list.get(i) == 10) {
                list.set(i, 0);
                list.set(i - 1, list.get(i - 1) + 1);
            } else
                break;
        }

        if (list.get(0) == 10) {
            list.set(0, 0);
            list.add(0, 1);
        }

        System.out.println(list);
    }
}
