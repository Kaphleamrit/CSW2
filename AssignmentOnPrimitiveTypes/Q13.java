package AssignmentOnPrimitiveTypes;

public class Q13 {
    public static void main(String[] args) {
        System.out.println(divide(30, 5));
    }

    static int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            dividend = sub(dividend, divisor);
            ++quotient;
        }

        return sign * quotient;
    }

    static int sub(int a, int b) {

        while (b != 0) {

            int brw = (~a) & b;
            a = a ^ b;
            b = brw << 1;
        }

        return a;
    }

}
