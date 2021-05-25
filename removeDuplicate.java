import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 45, 3, 5, 4, 55, 6, 7, 7, 7));
        Set<Integer> set = new HashSet<>(list);
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));

    }

}
