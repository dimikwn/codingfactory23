package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει έναν αριθμό που συμβολίζει βαθμό,
 * από τον χρήστη και εμφανίζει κατάλληλο μήνυμα.
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        choice = in.nextInt();

        //switch that fall-through
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κάτω από τη βάση");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν καλώς");
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Παρακαλώ δώστε αριθμό από το 1 - 10");
                break;
        }
    }
}
