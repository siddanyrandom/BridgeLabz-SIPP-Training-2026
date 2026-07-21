package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Scenario4 {
    static List<Integer> topKLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) {
            if (pq.size() < k) pq.offer(x);
            else if (x > pq.peek()) {
                pq.poll();
                pq.offer(x);
            }
        }
        return new ArrayList<>(pq);
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 20, 8, 15};
        System.out.println(topKLargest(arr, 3));
    }
}
