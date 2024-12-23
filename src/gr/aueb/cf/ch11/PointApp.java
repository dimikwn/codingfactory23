package gr.aueb.cf.ch11;

/**
 * {@link Point} driver class.
 *
 * @author 30694
 */

public class PointApp {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        Point p3 = new Point();

        p3.setX(7);
        p3.setY(12);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());
        System.out.println(p3.pointToString());
    }
}
