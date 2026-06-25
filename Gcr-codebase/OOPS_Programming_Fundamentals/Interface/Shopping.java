package ScenarioBasedOOPs.Interface;

interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

public class ShoppingCart implements CouponValidator {
    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }

    public static void main(String[] args) {
        String[] coupons = { "SAVE10", "AB1", "SAVE50", "DISC" };
        ShoppingCart sc = new ShoppingCart();
        for (String c : coupons)
            System.out.println(c + " : " + (sc.validateCoupon(c) ? "Valid" : "Invalid"));
    }
}
