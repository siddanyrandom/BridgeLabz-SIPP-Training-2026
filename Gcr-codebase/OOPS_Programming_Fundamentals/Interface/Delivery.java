package ScenarioBasedOOPs.Interface;

interface FoodDelivery {
    void deliverFood();

    default void trackOrder() {
        System.out.println("Tracking food order");
    }

    static String generateDeliveryCode() {
        return "FD123";
    }
}

interface GroceryDelivery {
    void deliverGroceries();

    default void trackOrder() {
        System.out.println("Tracking grocery order");
    }
}

public class DeliveryExecutive implements FoodDelivery, GroceryDelivery {
    public void deliverFood() {
    }

    public void deliverGroceries() {
    }

    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public static void main(String[] args) {
        String[] customers = { "Aman", "Raj", "Priya" };
        for (String c : customers)
            System.out.println("Delivering to " + c);
        DeliveryExecutive d = new DeliveryExecutive();
        d.trackOrder();
        System.out.println("Code: " + FoodDelivery.generateDeliveryCode());
    }
}
