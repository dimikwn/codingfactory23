package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 αστεράκια στην 1η σειρά,
 * 9 αστεράκια στη 2η σειρά, μέχρι ένα αστεράκι
 * στην 10η σειρά.
 */
public class StarDesc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
