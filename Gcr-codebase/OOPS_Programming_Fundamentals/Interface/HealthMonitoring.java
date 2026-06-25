package ScenarioBasedOOPs.Interface;

interface HeartRateMonitor {
    void showHeartRate();

    default void displayHealthTips() {
        System.out.println("Exercise regularly.");
    }
}

interface TemperatureMonitor {
    void showTemperature();

    default void displayHealthTips() {
        System.out.println("Stay hydrated.");
    }

    static boolean isPatientIdValid(String id) {
        return id.startsWith("P");
    }
}

public class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    public void showHeartRate() {
    }

    public void showTemperature() {
    }

    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public static void main(String[] args) {
        String[] names = { "John", "Emma", "Alex" };
        String[] ids = { "P101", "101", "P303" };
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i] + " valid ID: " + TemperatureMonitor.isPatientIdValid(ids[i]));
        System.out.println("Final Health Report Generated");
    }
}
