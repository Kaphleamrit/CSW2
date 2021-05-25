package ArrayList;

public class Q4 {
    public static void main(String[] args) {
        long num = 7L;
        System.out.println(getParity(num));

    }

    static int getParity(long num) {
        num ^= num >> 32;
        num ^= num >> 16;
        num ^= num >> 8;
        num ^= num >> 4;
        num ^= num >> 2;
        num ^= num >> 1;
        return (int) num & 1;
    }
}
