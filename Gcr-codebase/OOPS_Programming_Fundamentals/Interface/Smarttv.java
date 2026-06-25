package ScenarioBasedOOPs.Interface;

interface StreamingService {
    void streamContent();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Active");
    }
}

public class SmartTV implements StreamingService, GamingService {
    public void streamContent() {
    }

    public void playGame() {
    }

    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {
        String[] movies = { "Avatar", "Inception", "Titanic" };
        String[] games = { "GTA", "Minecraft", "FIFA" };
        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();
        for (String m : movies)
            System.out.println("Movie: " + m);
        for (String g : games)
            System.out.println("Game: " + g);
    }
}
