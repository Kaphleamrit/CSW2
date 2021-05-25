import java.util.ArrayList;
import java.util.Arrays;

public class twoDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int size = 5;
        for(int i = 0; i<size; i++) {
            list.add(new ArrayList<Integer>());
            list.add((ArrayList<Integer>)Arrays.asList(1,2,3,4,5));
        }
        
        System.out.println(list);
    }
    
}
