class Subscription {
    String subscriberName;
    String subscriptionId;

    Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    double calculateMonthlyCharge() {
        return 0;
    }
}

class BasicPlan extends Subscription {

    BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 299;
    }
}

class PremiumPlan extends Subscription {

    PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 599;
    }
}

class FamilyPlan extends Subscription {

    FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 899;
    }
}

public class StreamingPlatform {

    static void calculateTotalRevenue(Subscription[] subscriptions) {

        double totalRevenue = 0;
        double highestCharge = 0;
        Subscription expensivePlan = null;

        for (Subscription subscription : subscriptions) {

            double charge = subscription.calculateMonthlyCharge();
            totalRevenue += charge;

            if (charge > highestCharge) {
                highestCharge = charge;
                expensivePlan = subscription;
            }
        }

        System.out.println("Total Monthly Revenue: ₹" + totalRevenue);

        System.out.println("\nMost Expensive Subscription:");
        System.out.println("Subscriber: " + expensivePlan.subscriberName);
        System.out.println("Subscription ID: " + expensivePlan.subscriptionId);
        System.out.println("Monthly Charge: ₹" + highestCharge);
    }

    static void searchBySubscriptionId(Subscription[] subscriptions, String id) {

        boolean found = false;

        for (Subscription subscription : subscriptions) {
            if (subscription.subscriptionId.equals(id)) {
                System.out.println("\nSubscription Found:");
                System.out.println("Subscriber: " + subscription.subscriberName);
                System.out.println("Subscription ID: " + subscription.subscriptionId);
                System.out.println("Monthly Charge: ₹" + subscription.calculateMonthlyCharge());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Subscription not found.");
        }
    }

    static void displaySubscribersByLetter(Subscription[] subscriptions, char letter) {

        System.out.println("\nSubscribers starting with '" + letter + "':");

        for (Subscription subscription : subscriptions) {
            if (subscription.subscriberName.startsWith(String.valueOf(letter))) {
                System.out.println(subscription.subscriberName);
            }
        }
    }

    public static void main(String[] args) {

        Subscription[] subscriptions = {
                new BasicPlan("Siddhartha", "S101"),
                new PremiumPlan("Rahul", "P201"),
                new FamilyPlan("Priya", "F301"),
                new BasicPlan("Rohan", "S102"),
                new PremiumPlan("Ankit", "P202")
        };

        calculateTotalRevenue(subscriptions);

        searchBySubscriptionId(subscriptions, "F301");

        displaySubscribersByLetter(subscriptions, 'R');
    }
}
