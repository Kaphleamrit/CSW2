package AssignmentOnPrimitiveTypes;

public class Q15 {
    public static void main(String[] args) {
        int num = 56;
        System.out.println(rev(num));

    }

    static int rev(int num) {
        int revv = 0;
        while (num != 0) {
            int rem = num % 10;
            revv = revv * 10 + rem;
            num /= 10;
        }
        return revv;
    }

}
