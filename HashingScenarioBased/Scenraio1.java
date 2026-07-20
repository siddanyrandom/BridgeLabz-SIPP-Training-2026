package HashingScenarioBased;

import java.util.HashSet;

class Scenario1 {
    public boolean hasDuplicateToken(String[] tokens) {
        HashSet<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) return true;
        }
        return false;
    }
}
