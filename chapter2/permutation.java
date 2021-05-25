package chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permutation {
    static int counter = 0;
    public static void main(String[] args) {
        
    ArrayList<String> list = new ArrayList<>();
    for(char c = 'a'; c<='f'; c++) {
        list.add(c+"");
    }      
      permutate(list, 0, 5);
      System.out.println(counter);
    }

    static void permutate(List<String> s, int l, int r) {
        if(l == r) {
        System.out.println(s.toString());
        counter++;
        }
        else {
            for(int i=l ; i<=r; i++) {
            Collections.swap(s,l,i);
            permutate(s, l+1, r);
            }
        }
    }
}
