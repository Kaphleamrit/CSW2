import java.util.ArrayList;
import java.util.List;

public class nthRow {
    public static void main(String[] args) {
        System.out.println(printNthRow(4));
    }

    static List<Integer> printNthRow(int n) {
        List<Integer> list   = new  ArrayList<>();
        int res =1 ;

        for(int i=1; i<=n+1; i++) {

            list.add(res);
            res = res *(n-i+1)/i;
        }

        return list;
    }
}
