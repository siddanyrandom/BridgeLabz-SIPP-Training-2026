import java.util.Scanner;

public class Permutations {

    static void permutations(String s, String current) {
        if (s.length() == 0) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            permutations(remaining, current + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        permutations(s, "");
        sc.close();
    }
}
