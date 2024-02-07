package gr.aueb.cf.ch7;

/**
 * Compares two strings.
 */
public class CompareApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        if (s1.compareTo(s2) < 0) {
            System.out.println("s1 lt s2");      // lt = less than
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("s1 gt s2");      // gt = greater than
        } else {
            System.out.println("s1 eq s2");
        }
    }
}
