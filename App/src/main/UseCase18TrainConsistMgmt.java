package main;

public class UseCase18TrainConsistMgmt {

    // 🔹 Linear Search Method
    public boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {

            // compare using equals()
            if (id.equals(key)) {
                return true; // found → stop early
            }
        }

        return false; // not found
    }
}