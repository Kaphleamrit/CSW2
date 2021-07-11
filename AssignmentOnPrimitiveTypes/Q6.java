package AssignmentOnPrimitiveTypes;

public class Q6 {
    public static void main(String[] args) {
        int[] arrS = new int[26];
        int[] arrL = new int[26];
        for (int i = 'a'; i <= 'z'; i++) {
            arrS[i - 'a'] = parity(i);
        }
        for (int j = 'A'; j <= 'Z'; j++) {
            arrL[j - 'A'] = parity(j);
        }
        char[] inp = "elePhanT".toCharArray();
        int counter = 0;
        for (char c : inp) {
            if (c >= 97 && c <= 122 && arrS[c - 'a'] == 1)
                counter++;
            else if (c >= 65 && c <= 90 && arrL[c - 'A'] == 1)
                counter++;
        }
        System.out.println("The parity of the word  is: " + (counter % 2 == 0 ? " 0" : " 1"));
    }

    static int parity(int n) {
        boolean parity = false;
        while (n != 0) {
            parity = !parity;
            n = n & (n - 1);
        }
        return parity ? 1 : 0;
    }
}
