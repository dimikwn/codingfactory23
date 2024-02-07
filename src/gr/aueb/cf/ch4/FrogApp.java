package gr.aueb.cf.ch4;

import org.w3c.dom.ls.LSOutput;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog θέλει να φτάσει στη θέση Χ και θέλει να φτάσει
 * στη θέση Υ (ή σε θέση > Υ). O frog jumps a fixed distance, D.
 *
 * Βρίσκει τοn ελάχιστο αριθμό jumps που ο small frog πρέπει να κάνει
 * ώστε να φτάσει ή να ξεπεράσει το στόχο του.
 *
 * Για παράδειγμα αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10 και μετά το πρώτο jump πάει στη θέση 10 + 30 = 40
 * Στο 2ο jump, πάει 40 + 30 = 70
 * Και στο 3ο jump πάει 70 + 30 = 100.
 */
public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y =85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Jumps: " + jumps);

    }
}
