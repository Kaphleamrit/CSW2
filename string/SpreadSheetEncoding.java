public class SpreadsheetEncoding {
    public static void main(String[] args) {
        System.out.println(getColId("ZZZ"));
        // System.out.println(getStringId(702));
    }

    static int getColId(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 26 + s.charAt(i) - 'A' + 1;
        }
        return res;
    }

    static String getStringId(int num, StringBuilder sb) {

        return " ";
    }
}