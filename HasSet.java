import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HasSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,23,4,3,5,3,53,43,2));
        for(int c: set) {
            System.out.println(c);
        }
       
    }
    
}
