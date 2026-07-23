import java.util.*;

public class UndirectedCycleDetection {

    public static boolean hasWiringLoop(Map<Integer, List<Integer>> circuit, int n) {

        Set<Integer> visited = new HashSet<>();

        for (int v = 0; v < n; v++) {

            if (!visited.contains(v)) {
                if (dfsCycleCheck(circuit, v, -1, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfsCycleCheck(Map<Integer, List<Integer>> circuit,
                                        int node,
                                        int parent,
                                        Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : circuit.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {

                if (dfsCycleCheck(circuit, neighbor, node, visited)) {
                    return true;
                }

            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> circuit = new HashMap<>();

      

        circuit.put(0, Arrays.asList(1, 3));
        circuit.put(1, Arrays.asList(0, 2));
        circuit.put(2, Arrays.asList(1, 3));
        circuit.put(3, Arrays.asList(0, 2));

        int n = 4;

        if (hasWiringLoop(circuit, n)) {
            System.out.println("Cycle Detected (Wiring Loop Exists)");
        } else {
            System.out.println("No Cycle Found");
        }
    }
}
