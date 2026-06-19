import java.util.Scanner;

public class TowerOfHanoi {

    static void hanoi(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        hanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        hanoi(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        hanoi(n, 'A', 'C', 'B');
        sc.close();
    }
}
