import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {

    static void generateSubsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        // exclude current element
        generateSubsets(arr, index + 1, current);

        // include current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        generateSubsets(arr, 0, new ArrayList<>());
        sc.close();
    }
}
