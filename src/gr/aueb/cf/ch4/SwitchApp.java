package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of if - then - else.
 * Gets user's choice and gives feedback.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please select one of the following");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team game");
        System.out.println("4. Exit");
        System.out.println("5. Please insert your choice");

        // Get the choice
        choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Start one-player game");
                break;
            case 2:
                System.out.println("Play two-player game");
                break;
            case 3:
                System.out.println("Start team game");
                break;
            case 4:
                System.out.println("Exit game");
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        System.out.println("Goodbye");
    }
}