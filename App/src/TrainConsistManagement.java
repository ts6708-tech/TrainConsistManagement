import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " (Cargo: " + cargo + ")";
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> goods = new ArrayList<>();

        goods.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        goods.add(new GoodsBogie("Open", "Coal"));             // allowed
        goods.add(new GoodsBogie("Box", "Grain"));             // allowed
        goods.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goods.forEach(System.out::println);

        // UC12: SAFETY CHECK
        boolean isSafe = goods.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nSystem enforces safety compliance...");
    }
}