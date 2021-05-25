package extra;

public class RecCheck {
    // you are given with four points and check if they are vertices of a rectangle
    // or not

    public static boolean check(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        if ((Math.abs(x1 - x2) == Math.abs(x3 - x4)) && Math.abs(y1 - y2) == Math.abs(y3 - y4)) {

            double d1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
            double d2 = Math.sqrt(Math.pow(x2 - x4, 2) + Math.pow(y2 - y4, 2));
            return d1 == d2 ? true : false;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check(0, 0, 1, 0, 1, 1, 0, 1));
    }
}
