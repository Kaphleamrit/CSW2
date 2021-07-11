package AssignmentOnPrimitiveTypes;

// 7.	Write a program to calculate parity bit of a 64 bit word using only xor and right shift operator.
public class Q7 {
    public static void main(String[] args) {
        String s = "something";

        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += parity((int) arr[i]);
        }
        System.out.println(sum % 2 == 0 ? "0" : "1");

    }

    public static int parity(int n) {
        int c = 0;

        while (n != 0) {
            c += n ^ 0;
            n >>>= 1;
        }
        return c % 2 == 0 ? 0 : 1;
    }

}
