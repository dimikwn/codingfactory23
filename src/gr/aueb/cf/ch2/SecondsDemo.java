package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μεταρέπει δευτερόλεπτα σε days, hours,
 * minutes, seconds.
 */
public class SecondsDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTES_SECS = 60;
        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please insert the total amount of seconds");
        inputSeconds = in.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY_SECS;
        remainingSeconds = remainingSeconds % DAY_SECS;

        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds = remainingSeconds % HOUR_SECS;

        minutes = remainingSeconds / MINUTES_SECS;
        remainingSeconds = remainingSeconds % MINUTES_SECS;

        System.out.printf("%,d input seconds = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);



    }
}
