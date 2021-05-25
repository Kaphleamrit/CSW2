import java.util.ArrayList;
import java.util.Arrays;

public class schoolMultiplication {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7, 6, 3));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(7, 8, 9));
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < list.size() + list2.size(); i++) {
            list3.add(0);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = list2.size() - 1; j >= 0; j--) {
                int val = list3.get(i + j + 1) + list.get(i) * list2.get(j);
                System.out.println(list3);
                list3.set(i + j + 1, val);
                list3.set(i + j, list3.get(i + j) + val / 10);
                list3.set(i + j + 1, val % 10);
            }
        }

        System.out.println(list3);
    }

}
