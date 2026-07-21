package Heaps;

import java.util.Arrays;

public class Scenario3 {
    static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) siftDown(arr, i, n);
        for (int end = n - 1; end > 0; end--) {
            int t = arr[0];
            arr[0] = arr[end];
            arr[end] = t;
            siftDown(arr, 0, end);
        }
    }

    static void siftDown(int[] arr, int i, int n) {
        while (true) {
            int largest = i, l = 2 * i + 1, r = 2 * i + 2;
            if (l < n && arr[l] > arr[largest]) largest = l;
            if (r < n && arr[r] > arr[largest]) largest = r;
            if (largest == i) break;
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;
            i = largest;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 3, 2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
