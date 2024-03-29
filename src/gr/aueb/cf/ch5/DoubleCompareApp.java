package gr.aueb.cf.ch5;

/**
 * Ελέγχει ισότητα / ανισότητα στους
 * floating points.
 */
public class DoubleCompareApp {

    public static void main(String[] args) {
        double d1 = 0.999;
        double d2 = 1.001;
        final double EPSILON = 0.005;

        if (Math.abs(d2 - d1) <= EPSILON) {
            System.out.println("EQUAl");
        } else {
            System.out.println("NOT Equal");
        }
    }
}
