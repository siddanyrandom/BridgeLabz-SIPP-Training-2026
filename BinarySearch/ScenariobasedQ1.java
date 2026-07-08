import java.util.Scanner;

public class AstronomerScenario {

    // 1. Binary Search
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // 2. Search in Rotated Sorted Array
    static int searchRotated(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    // 3. First Occurrence
    static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return ans;
    }

    // 4. Last Occurrence
    static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return ans;
    }

    // 5. Find Minimum in Rotated Sorted Array
    static int findMinimum(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[low];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- Binary Search --------
        int n = sc.nextInt();
        int[] sorted = new int[n];

        for (int i = 0; i < n; i++)
            sorted[i] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println("Binary Search Index: " + binarySearch(sorted, target));

        // -------- Rotated Array Search --------
        int m = sc.nextInt();
        int[] rotated = new int[m];

        for (int i = 0; i < m; i++)
            rotated[i] = sc.nextInt();

        int rotatedTarget = sc.nextInt();

        System.out.println("Rotated Search Index: " + searchRotated(rotated, rotatedTarget));

        // -------- First & Last Occurrence --------
        int size = sc.nextInt();
        int[] repeated = new int[size];

        for (int i = 0; i < size; i++)
            repeated[i] = sc.nextInt();

        int repeatTarget = sc.nextInt();

        System.out.println("First Occurrence: " + firstOccurrence(repeated, repeatTarget));
        System.out.println("Last Occurrence : " + lastOccurrence(repeated, repeatTarget));

        // -------- Minimum in Rotated Array --------
        int x = sc.nextInt();
        int[] rotatedMin = new int[x];

        for (int i = 0; i < x; i++)
            rotatedMin[i] = sc.nextInt();

        System.out.println("Minimum Element: " + findMinimum(rotatedMin));

        sc.close();
    }
}
