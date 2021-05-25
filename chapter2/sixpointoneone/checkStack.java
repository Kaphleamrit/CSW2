import java.util.Arrays;
// import java.util.Iterator;
// import java.util.List;
import java.util.Stack;

public class checkStack {
    public static void main(String[] args) {
        Stack<Integer> foo = new Stack<Integer>();
        for(int i : Arrays.asList(1,2,3,4,5,6)) {
            foo.push(i);
        }
        // for(int i : foo) System.out.println(i);
        while(!foo.isEmpty()) System.out.println(foo.pop());
       

       
        
    }
    
}
