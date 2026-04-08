import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Bogie class
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

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Sleeper", 70));      // duplicate type
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("AC Chair", 55));     // duplicate type

        // Display original list
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // GROUPING BY TYPE (name)
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");
        grouped.forEach((type, list) -> {
            System.out.println(type + " → " + list);
        });

        System.out.println("\nSystem supports grouping for analytics...");
    }
}