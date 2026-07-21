package Heaps;

import java.util.PriorityQueue;

public class Scenario5 {
    static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) {
            if (pq.size() < k) pq.offer(x);
            else if (x > pq.peek()) {
                pq.poll();
                pq.offer(x);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(arr, 2));
    }
}
