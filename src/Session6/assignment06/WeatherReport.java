package Session6.assignment06;

public class WeatherReport {

    public static void main(String[] args) {

        String[] days = {
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        };

        double[] temps = {
                19.5, 22.0, 25.5, 21.0, 18.0, 27.5, 24.0
        };

        // Find total, hottest day, and coldest day
        double total = 0;
        int hottestIndex = 0;
        int coldestIndex = 0;

        for (int i = 0; i < temps.length; i++) {

            total += temps[i];

            if (temps[i] > temps[hottestIndex]) {
                hottestIndex = i;
            }

            if (temps[i] < temps[coldestIndex]) {
                coldestIndex = i;
            }
        }

        double average = total / temps.length;

        // Count days above average
        int daysAboveAverage = 0;

        for (double temp : temps) {
            if (temp > average) {
                daysAboveAverage++;
            }
        }

        // Build the complete weather report
        StringBuilder report = new StringBuilder();

        report.append("=== WEEKLY WEATHER REPORT ===\n");
        report.append(String.format(
                "Average temperature : %.2f C%n", average
        ));
        report.append(String.format(
                "Hottest day         : %s (%.1f C)%n",
                days[hottestIndex], temps[hottestIndex]
        ));
        report.append(String.format(
                "Coldest day         : %s (%.1f C)%n",
                days[coldestIndex], temps[coldestIndex]
        ));
        report.append(
                "Days above average  : " + daysAboveAverage + "\n\n"
        );

        // Build the bar chart
        for (int i = 0; i < temps.length; i++) {

            report.append(days[i]).append(" | ");

            int bars = (int) temps[i];

            for (int j = 0; j < bars; j++) {
                report.append("#");
            }

            report.append(String.format(" %.1f%n", temps[i]));
        }

        System.out.print(report);
    }
}
