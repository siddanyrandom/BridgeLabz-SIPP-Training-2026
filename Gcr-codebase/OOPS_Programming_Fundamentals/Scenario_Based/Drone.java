package ScenarioBasedProblemsOOPs;

public class Drone {
    String droneID;
    int batteryPercentage;
    static String companyName;
    Drone(String droneID, int batteryPercentage){
        this.droneID = droneID;
        this.batteryPercentage = batteryPercentage;
    }

    String startDelievery() {
        if (batteryPercentage > 20) {
            return "Started Delivery";
        }
        return "Low Battery";
    }

    void displayStatus() {
        System.out.println("\nCompany Name : " + companyName +
                        "\nDrone ID     : " + droneID +
                        "\nBattery      : " + batteryPercentage + "%" +
                        "\nDelivery Status : " + (startDelievery()));
    }

    public static void main(String[] args) {

        Drone d1 = new Drone("D101", 85);
        Drone d2 = new Drone("D102", 45);
        Drone d3 = new Drone("D103", 15);

        Drone.companyName = "SkyLogistics";

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}
