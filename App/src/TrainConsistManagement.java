import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (reuse from UC7)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagement {
    public static void main(String[] args) {

        // Welcome
        System.out.println("=== Train Consist Management App ===");

        // Original list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("Luxury", 80));

        // Display original list
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // STREAM FILTER → capacity > 60
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        // Display filtered list
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);

        // Verify original list unchanged
        System.out.println("\nOriginal List (unchanged):");
        bogies.forEach(System.out::println);

        System.out.println("\nSystem supports stream-based filtering...");
    }

}
