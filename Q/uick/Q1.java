package Q.uick;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(true);
        list.add(false);
        list.add(false);
        list.add(true);
        list.add(true);
        list.add(false);

        boolean pivot = false;
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(pivot)) {
                Collections.swap(list, flag++, i);
            }
        }
        System.out.println(list);
    }
}
