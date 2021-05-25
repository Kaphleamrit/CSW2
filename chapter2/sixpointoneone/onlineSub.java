
package chapter2.sixpointoneone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class onlineSub {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g"));
        Random r = new Random();
        int k =3 ; 
        
        List<String> list2 = list.subList(0,k);

        for(int i=k ; i<list.size(); i++) {

            int x = r.nextInt(i+1);
            System.out.print(  x + "   ");
            System.out.println(list2);
            if(x<k) list2.set(x,list.get(i));
        }
        
        System.out.println(list2);
    }
    
}


// create a 2d array 3x3 using an arraylist have elements between o to 9 