package Session3.task04;

import java.util.Scanner;

public class PinGate {
    public static void main(String[] args) {
        final int CORRECT_PIN = 2026;
        final int MAX_TRIES = 3;

        Scanner in = new Scanner(System.in);
        int tries = 0;
        boolean unlocked = false;

        while (tries < MAX_TRIES) {
            System.out.print("Enter PIN: ");
            int pin = in.nextInt();

            if (pin == CORRECT_PIN) {
                unlocked = true;
                break;
            }

            tries++;
            System.out.println("Wrong PIN. Attempts left: " + (MAX_TRIES - tries));
        }

        if (unlocked) {
            System.out.println("Access granted. Welcome.");
        } else {
            System.out.println("Card retained. Please contact your bank.");
        }

        in.close();
    }
}
