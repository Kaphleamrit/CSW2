package AssignmentOnPrimitiveTypes;

public class Q8 {
    public static void main(String[] args) {
        int num = 5;
        int num2 = swap(num, 1, 0); // gives the swapped int
        System.out.println("Before swapping: " + Integer.toString(num, 2)); // converts decimal into binary
        System.out.println("After swapping: " + Integer.toString(num2, 2));

    }

    public static int swap(int num, int i, int j) {

        // 110001

        // i =1 and j =4
        // 000010 | 010000 = 010010
        // 110001 ^ 10010 = 010011

        if ((num >>> i & 1) != (num >>> j & 1)) {
            int mask = (1 << i) | (1 << j); // puts 1s at ith and jth position and 0s in other position
            num = num ^ mask;
            return num;
        }
        return num;
    }
}
