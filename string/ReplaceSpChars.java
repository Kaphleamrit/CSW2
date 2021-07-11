import java.util.LinkedList;

public class ReplaceSpChars {
    static int c = 0;

    public static void main(String[] args) {
        String s = "R.Rakesh!How are you, How you doing?";
        LinkedList<String> list = new LinkedList<>();

        for (char c : s.toCharArray())
            list.add(c + "");

        System.out.println(telex(list));
    }

    // , COMMA
    // ! EXCLAMATION MARK
    // ? QUESTION MARK
    // . DOT

    static String telex(LinkedList<String> list) {

        list.forEach(t -> {
            if (t.equals("."))
                list.set(c, "DOT");
            if (t.equals("?"))
                list.set(c, "QUESTION MARK");
            if (t.equals("!"))
                list.set(c, "EXCLAMATION MARK");
            if (t.equals(","))
                list.set(c, "COMMA");
            c++;
        });

        return String.valueOf(list);
    }

}
