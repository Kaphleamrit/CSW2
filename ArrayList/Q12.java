package ArrayList;

public class Q12 {

    public static void main(String[] args) {
        int product = 0;

        int n1 = 5;

        int n2 = 6;
        for (int i = 0; i < n2; i++) {
            product = add(product, n1);
        }
        System.out.print("product of " + n1 + " and " + n2 + " is:  " + product);
    }

    static int add(int a, int b) {
        while (b != 0) {
            int c = (a & b);
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
}