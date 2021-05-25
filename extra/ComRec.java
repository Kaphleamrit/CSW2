package extra;

public class ComRec {
    // WAP to test if two rectangles have non empty intersection.
    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(0, 0, 2, 1);
        Rectangle r1 = new Rectangle(1, 1, 2, 1);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(isIntersecting(r1, r2));
    }

    public static boolean isIntersecting(Rectangle r1, Rectangle r2) {
        if ((r1.x + r1.w >= r2.x) && (r1.y + r1.h >= r2.y) && (r2.x + r2.w >= r1.x) && (r2.y + r2.h >= r1.y))
            return true;
        return false;
    }

}

class Rectangle {
    int x;
    int y;
    int w;
    int h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {

        return "(" + x + ", " + y + ")" + " Width: " + w + " Height: " + h;
    }
}
