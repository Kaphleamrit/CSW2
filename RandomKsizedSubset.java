import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * RandomKsizedSubset
 */
public class RandomKsizedSubset {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,4,6,3,2,5,65));
        System.out.println(ranSubset(list,5));
    }

    static List<Integer> ranSubset(List<Integer> list,int k) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        Random R = new Random();
        int n = list.size();
        for(int i =0 ; i<k; i++) { 
            System.out.println(map);

            int r = i + R.nextInt(n - i);
            System.out.println(r);
            Integer x = list.get(r);
            Integer y = list.get(i);

            if(x==null && y == null) {
                map.put(i,r);
                map.put(r,i);
            } else if(x != null && y == null){
                map.put(i,map.get(r));
                map.put(r,i);
            } else if(x == null && y != null) {
                map.put(r,map.get(i));
                map.put(i,r);
            } else {
                map.put(i,x);
                map.put(r,y);
            }
        }
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<k ; i++) {
            list2.add(map.get(i));
        }
        return list2;
    }
}