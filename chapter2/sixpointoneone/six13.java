package chapter2.sixpointoneone;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * six13
 */
public class six13 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h"));
        int k = 8;
        Random r = new Random();

        for(int i=0; i<list.size(); i++ ) {
            int j =r.nextInt(k - i) + i;
            Collections.swap(list,i,j);
            System.out.println(list);
        }

        System.out.println(list);
    }

    // static void offlineData(in)
}