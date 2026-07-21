package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Scenario6 {
    static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> lists.get(a[0]).get(a[1]) - lists.get(b[0]).get(b[1]));
        for (int i = 0; i < lists.size(); i++)
            if (!lists.get(i).isEmpty()) pq.offer(new int[]{i, 0});
        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int i = cur[0], j = cur[1];
            ans.add(lists.get(i).get(j));
            if (j + 1 < lists.get(i).size()) pq.offer(new int[]{i, j + 1});
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 5, 8),
                Arrays.asList(3, 6, 9)
        );
        System.out.println(mergeKSortedLists(lists));
    }
}
