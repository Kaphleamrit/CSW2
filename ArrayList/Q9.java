package ArrayList;

import java.util.Arrays;

public class Q9 {
    
        int[] A;

      public Q9() {
             A = new int[(int)Math.pow(2,16)];
              for(int i = 0; i < A.length; i++) {
            A[i] = rev(i);
        }

        }
    public static void main(String[] args) {
        Q9 a = new Q9();
      
        System.out.println(a.A[4]);

        System.out.println(Arrays.toString(a.A));
    }

   	public static int rev(int n) {
		int res = 0;
		while(n > 0 ) {
			int bit = (n & 1);
			res = res*2 + bit;
			n = n/2;
		}
		return res;
		
	}
}
