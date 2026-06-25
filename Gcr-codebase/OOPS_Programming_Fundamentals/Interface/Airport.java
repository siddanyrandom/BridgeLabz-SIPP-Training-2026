package ScenarioBasedOOPs.Interface;

interface LuggageScanner {
    void scanLuggage();

    default void displaySecurityGuidelines() {
        System.out.println("Check luggage.");
    }
}

interface PassportVerifier {
    void verifyPassport();

    default void displaySecurityGuidelines() {
        System.out.println("Carry passport.");
    }

    static boolean isPassportNumberValid(String p) {
        return p.length() >= 6;
    }
}

public class AirportSecuritySystem implements LuggageScanner, PassportVerifier {
    public void scanLuggage() {
    }

    public void verifyPassport() {
    }

    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public static void main(String[] args) {
        String[] names = { "Aman", "Raj", "Priya" };
        String[] pass = { "P12345", "AB12", "X987654" };
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " -> "
                    + (PassportVerifier.isPassportNumberValid(pass[i]) ? "Can Board" : "Cannot Board"));
    }
}
