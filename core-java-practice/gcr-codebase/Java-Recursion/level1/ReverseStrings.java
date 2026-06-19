import java.util.Scanner;

public class ReverseString {

    static String reverse(String s) {
        if (s.length() == 0)
            return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.println(reverse(s));
        sc.close();
    }
}
