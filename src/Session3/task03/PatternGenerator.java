package Session3.task03;

public class PatternGenerator {
    public static void main(String[] args) {

        System.out.println("=== 1. 10 x 10 MULTIPLICATION TABLE ===");

        for (int r = 1; r <= 10; r++) {
            for (int c = 1; c <= 10; c++) {
                System.out.printf("%4d", (r * c));
            }
            System.out.println();
        }

        System.out.println("\n=== 2. INVERTED NUMBER PYRAMID ===");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
