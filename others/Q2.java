public class Q2 {
    public static void main(String[] args) {
        System.out.println(getKey(3521, 2452, 1352));
    }

    static int getKey(int a, int b, int c) {
        int firstDigit = a / 1000;
        int secondDigit = (b / 100) % 10;
        int largest = c % 10;
        while (c != 0) {
            c /= 10;
            int digit = c % 10;
            if (largest < digit)
                largest = digit;
        }
        return (firstDigit * secondDigit) - largest;
    }

}
