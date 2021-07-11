public class Add {
    public static void main(String[] args) {
        System.out.println(add(5,3));
    }

    static int add(int x, int y) {
        int carry;

        while(y!=0) {
            carry = x & y;
            x = x ^ y;
            y = carry<<1;
        }
        return x;
    }
    
}
