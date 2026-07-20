package HashingScenarioBased;

import java.util.HashMap;

class Scenario2 {
    public int mostFrequentErrorCode(int[] codes) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int bestCode = codes[0], bestCount = 0;
        for (int code : codes) {
            int count = freq.getOrDefault(code, 0) + 1;
            freq.put(code, count);
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        return bestCode;
    }
}
