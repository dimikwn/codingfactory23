package gr.aueb.cf.ch5;

/**
 * Χρησιμοποιεί την μέθοδο swap() για
 * να ανταλλάξει αμοιβαία τις τιμές των a, b.
 * Ο τρόπος αυτός αμοιβαίας ανταλλαγής δε
 * δουλεύει γιατί τα a, b περνάνε ως input
 * (readonly) και όχι ως output.
 *
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a + " b = " + b);
    }
        /**
         * Swaps a, b, s = a -> b, b -> a.
         *
         * @param a     the first int
         * @param b     the second int
         */
        public static void swap(int a, int b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
}
