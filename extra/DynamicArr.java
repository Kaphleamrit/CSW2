package extra;

import java.util.*;

public class DynamicArr {
    int size = 8;
    int[] arr = new int[size];
    int flag;

    public DynamicArr() {
    }

    public DynamicArr(int defaultSize) {
        arr = new int[defaultSize];
        size = defaultSize;
        flag = 0;
    }

    public void insert(int toAdd) {
        if (size <= flag + 1)
            increase(flag);

        arr[flag++] = toAdd;
    }

    public void increase(int prevSize) {

        int[] arr2 = new int[prevSize * 2];
        for (int i = 0; i < arr.length; i++)
            arr2[i] = arr[i];

        arr = arr2;
    }

    public String toString() {

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        DynamicArr a = new DynamicArr(2);
        a.insert(345);
        a.insert(43);
        a.insert(242);
        a.insert(3223);
        a.insert(43);
        System.out.println(a);
    }
}
