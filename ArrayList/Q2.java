package ArrayList;

public class Q2 {
    public static void main(String[] args) throws Exception{
       int num = 3;
       int parity = parity(num) % 2 == 0? 0 : 1;
       System.out.println(parity);
      

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
