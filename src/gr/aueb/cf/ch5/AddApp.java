package gr.aueb.cf.ch5;

/**
 * Προσθέτει 2 ακεραίους  με τη χρήση
 * της μεθόδου add.
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = AddApp.add(a, b);

        System.out.println(sum);
    }
    public static int add(int a, int b) {
        // Δήλωση και αρχικοποίηση
        // int sum = 0;

        // Εντολές
        // sum = a + b;

        // Επιστροφή αποτελέσματος
        return a + b;
    }
}

