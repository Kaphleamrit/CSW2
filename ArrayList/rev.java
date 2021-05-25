package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(34,2,5,34,56,1));
        
        System.out.println(list);
        int i=0; int j=list.size()-1;

        while(i<=j) {
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

        System.out.println(list);
        
    }
    
}
