package HashingScenarioBased;

import java.util.HashMap;

class Scenario3 {
    public int[] findFraudPair(int[] amounts, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(amounts[i], i);
        }
        return new int[]{-1, -1};
    }
}
