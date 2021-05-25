package ArrayList;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        System.out.println(pow(5, 3));
        Scanner scanner = new Scanner(System.in);
    }

    static int pow(int x, int y) {
        int pow = 1;

        for (int i = 0; i < y; i++) {
            pow = multiply(pow, x);
        }
        return pow;
    }

    static int multiply(int a, int b) {
        int product = 0;
        for (int i = 0; i < b; i++) {
            product = add(product, a);
        }
        return product;
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
