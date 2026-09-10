package Session2.task03;

public class BmiCalculator {
    public static void main(String[] args) {

        double weightKg = 72.5;
        double heightM = 1.78;

        double bmi = weightKg / ( heightM * heightM);
        int truncatedBmi = (int) bmi;
        boolean isNormalRange = (bmi >= 18.5) && (bmi <= 24.9);

        String evaluation = isNormalRange ? "NORMAL WEIGHT": "ATTENTION NEEDED";

        System.out.println("=== SMART HEALTH DIAGNOSTIC ===");
        System.out.printf("Weight (kg)        : %.1f%n", weightKg);
        System.out.printf("Height (m)         : %.2f%n", heightM);
        System.out.printf("Exact BMI          : %.2f%n", bmi);
        System.out.printf("Truncated BMI (int): %d%n", truncatedBmi);
        System.out.printf("Health Status      : %s%n", evaluation);
    }
}
