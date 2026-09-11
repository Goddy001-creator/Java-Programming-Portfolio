package Session3.task01;

public class TrafficController {
    public static void main(String[] args) {
        String signal = "YELLOW";

        System.out.println("=== AI VEHICLE NAVIGATION SYSTEM ===");
        System.out.println("Detected Signal: " + signal);

        switch (signal.toUpperCase()) {
            case "RED":
                System.out.println("ACTION: Full Brake! Bring vehicle to complete stop.");
                break;
            case "YELLOW":
                System.out.println("ACTION: Decelerate cautiously. Prepare to stop at line.");
                break;
            case "GREEN":
                System.out.println("ACTION: Accelerate and proceed safely through intersection.");
                break;
            case "FLASHING_YELLOW":
                System.out.println("ACTION: Yield right of way and proceed with extreme caution.");
                break;
            default:
                System.out.println("ALERT: Sensor malfunction or unknown signal! Engaging emergency stop.");
                break;
        }
    }
}
