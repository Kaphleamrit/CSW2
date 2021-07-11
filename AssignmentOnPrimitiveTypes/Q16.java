package AssignmentOnPrimitiveTypes;

public class Q16 {
    public static void main(String[] args) throws Exception {
        Rectangle r2 = new Rectangle(0, 0, 2, 1);
        Rectangle r1 = new Rectangle(1, 0, 2, 1);
        System.out.println(getIntersectingRectangle(r1, r2));

    }

    static Rectangle getIntersectingRectangle(Rectangle r1, Rectangle r2) throws Exception {
        if (r1.x + r1.w > r2.x && r1.y + r1.h > r2.y && r2.x + r2.w > r1.x && r2.y + r2.h > r1.y) {
            return new Rectangle(r2.x, r2.y, r1.x + r1.w - r2.x, r1.y + r1.h - r2.y);
        }
        throw new Exception("Rectangle is not formed by the intersection");
    }

}

class Rectangle {
    int x, y, w, h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")" + "width: " + w + " height: " + h;
    }

}
