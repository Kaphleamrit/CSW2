
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords2("Alice is same as Bob"));
    }

    static String reverseWords(String s) {

        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; --i) {
            sb.append(arr[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    static String reverseWords2(String s) {

        StringBuilder sb = new StringBuilder();

        int flag1 = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                sb.append(s.substring(i + 1, flag1) + " ");
                flag1 = i;
            }
        }
        sb.append(s.substring(0, flag1));
        return sb.toString();
    }
}
