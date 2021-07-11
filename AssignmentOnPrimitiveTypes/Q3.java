package AssignmentOnPrimitiveTypes;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(getParity(5));

    }

    static int getParity(int n) {
        boolean parity = false;
        while (n != 0) {
            parity = !parity;
            n = n & (n - 1);
        }
        return parity ? 1 : 0;

    }

}
