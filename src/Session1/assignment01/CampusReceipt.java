/*
 * Program: CampusReceipt
 * Purpose: Prints an official Aptech Smart Campus registration receipt
 *          for the AI-Driven Java Programming course.
 *
 * Author: Abasiakan Emem Akang
 * Student ID: Student1727062
 */

// This program demonstrates Java class structure, console output,
// escape sequences, and formatted receipt information.

package Session1.assignment01;

public class CampusReceipt {
    public static void main(String[] args){

        // Header
        System.out.println("+==================================================================+");
        System.out.println("|             APTECH COMPUTER EDUCATION - SMART KIOSK              |");
        System.out.println("|                   OFFICIAL REGISTRATION RECEIPT                  |");
        System.out.println("+==================================================================+");

        //Registration information
        System.out.println("Receipt No\t: REC-2026-98102");
        System.out.println("Date Issued\t: September 2026");
        System.out.println("Student Name\t: Abasiakan Emem Akang");
        System.out.println("Student ID\t: Student1727062");
        System.out.println("Course Track\t: ADSE");
        System.out.println("Schedule\t: Mon - Thu (2 Hours/Session)");
        System.out.println("--------------------------------------------------------------------");

        //Financial breakdown
        System.out.println("FEE ITEMIZATION\t\t\t\tAMOUNT (USD)");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Core Java Tuition Fee\t\t\t$ 450.00");
        System.out.println("Lab & Cloud AI Sandbox Access\t\t$ 120.00");
        System.out.println("Courseware & ProConnect Digital License\t$  80.00");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("TOTAL PAID\t\t\t\t$ 650.00");
        System.out.println("BALANCE OUTSTANDING\t\t\t$   0.00");

        // Security footer
        System.out.println("+==================================================================+");
        System.out.println("|    *** COMPUTER GENERATED RECEIPT - VERIFIED BY APTECH ***       |");
        System.out.println("+==================================================================+");
    }
}
