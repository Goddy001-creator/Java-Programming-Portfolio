package Session4.challenge04;

import java.util.Scanner;

public class WordInspector {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.nextLine().trim();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("Length      : " + word.length());
        System.out.println("Upper case  : " + word.toUpperCase());
        System.out.println("First / last: "
                + word.charAt(0) + " / "
                + word.charAt(word.length() - 1));
        System.out.println("Contains a? : "
                + word.toLowerCase().contains("a"));
        System.out.println("Palindrome? : " + isPalindrome);

        in.close();
    }
}
