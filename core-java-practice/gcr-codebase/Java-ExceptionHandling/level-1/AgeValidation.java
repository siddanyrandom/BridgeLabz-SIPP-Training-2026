import java.util.*;
class InvalidAgeException extends Exception{ public InvalidAgeException(String m){ super(m);} }
public class AgeValidation {
    static void validateAge(int age) throws InvalidAgeException {
        if(age < 18) throw new InvalidAgeException("Age must be 18 or above");
        System.out.println("Access granted!");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{ validateAge(sc.nextInt()); }
        catch(InvalidAgeException e){ System.out.println(e.getMessage()); }
    }
}
