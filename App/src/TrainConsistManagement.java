import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert data using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 30);

        // Display mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // Example lookup
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper"));

        // Program continues
        System.out.println("\nSystem ready for analytics and validation...");
    }
}