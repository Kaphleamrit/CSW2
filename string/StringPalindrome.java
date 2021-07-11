public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MOM"));
        System.out.println(isPalindrome("Ray a Ray"));
    }

    static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j)
                i++;
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j)
                j--;
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
