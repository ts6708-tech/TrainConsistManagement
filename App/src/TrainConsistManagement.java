import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies (in order)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate → ignored

        // Display formation
        System.out.println("\nTrain Formation (in insertion order, no duplicates):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Program continues
        System.out.println("\nSystem ensures ordered and unique train composition...");
    }
}