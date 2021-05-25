public class Help2 {
    public static void main(String[] args) {
        // System.out.println(findKey(3521, 2452, 1352));
        int[] a = {4,45,6,7,4,3};
        check(a);
    }

    static int findKey(int num1, int num2, int num3) {
        int l1=0,l2=0,l3=0;
        int s1=9,s2=9,s3=9;

        while(num1 !=0) {
            if(num1 % 10 > l1) l1 = num1 % 10;
            if(num1 % 10 < s1) s1 = num1 % 10;

              if(num2 % 10 > l2) l2 = num2 % 10;
            if(num2 % 10 < s2) s2 = num2 % 10;

              if(num3 % 10 > l3) l3 = num3 % 10;
            if(num3 % 10 < s3) s3 = num3 % 10;

            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            
            
        }
       
        
        return (l1+l2+l3) - (s1+s2+s3);
    }

   static void check(int... a) {
        for(int i: a) {
            System.out.println(i);
        }
    }
    
}

