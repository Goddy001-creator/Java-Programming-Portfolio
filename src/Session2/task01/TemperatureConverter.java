package Session2.task01;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 37.5;

        // Using 9.0 / 5.0 ensures floating-point division
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("=== WEATHER MONITORING SYSTEM ===");
        System.out.printf("Celsius Reading    : %.1f °C%n", celsius);
        System.out.printf("Fahrenheit Reading : %.1f °F%n", fahrenheit);
    }
}
