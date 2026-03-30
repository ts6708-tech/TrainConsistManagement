import java.util.ArrayList;
import java.util.List;

// Bogie Class (OOP)
class Bogie {
    String type;
    int capacity;

    // Constructor
    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // Display bogie details
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add Passenger Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        // Display bogies
        System.out.println("\nTrain Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Total capacity calculation
        int totalCapacity = 0;
        for (Bogie b : bogies) {
            totalCapacity += b.capacity;
        }

        System.out.println("\nTotal Passenger Capacity: " + totalCapacity);

        // Program continues
        System.out.println("\nSystem ready for advanced operations...");
    }
}