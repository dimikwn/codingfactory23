package gr.aueb.cf.ch4;

/**
 * Εμφανίζει 10 σειρές από αστεράκια
 * σε αύξουσα σειρά, 1 αστεράκι στην
 * 1η σείρα, 2 στη 2η σειρά, κοκ ,
 * 10 στη 10η σειρά.
 */
public class StarAsc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
