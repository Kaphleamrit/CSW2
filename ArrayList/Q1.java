/**
 * Q1
 */
package ArrayList;
public class Q1 {

    public static void main(String[] args) {
        int num = 3;
        System.out.println(parity(num));
    }

 public static int parity(int n ) {
        int counter = 0;

        while(n != 0) {
            int bit = n & 1;
            if(bit == 1) counter++;
            n >>>= 1;
        }
        return counter;
    }
}