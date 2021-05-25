package others;

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        System.out.println(findTotalOccurance(1, 20));
    }

    public static int findTotalOccurance(int input1, int input2) {
        int count = 0;
        for (int i = 0; i <= input2; i++) {
            count += getNo(input1, i);
        }
        return count;
    }

    static int getNo(int x, int i) {
        int toReturn = 0;
        while (i != 0) {
            int rem = i % 10;
            if (rem == x)
                toReturn++;
            i /= 10;
        }
        return toReturn;
    }

}