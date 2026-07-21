package Heaps;

import java.util.Arrays;

public class Scenario2 {
    static void buildHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) siftDown(arr, i, arr.length);
    }

    static void siftDown(int[] arr, int i, int n) {
        int smallest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < n && arr[left] < arr[smallest]) smallest = left;
        if (right < n && arr[right] < arr[smallest]) smallest = right;
        if (smallest != i) {
            int t = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = t;
            siftDown(arr, smallest, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 1, -2, 6, 5};
        buildHeap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
