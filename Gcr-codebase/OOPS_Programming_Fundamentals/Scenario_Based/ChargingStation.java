package ScenarioBasedProblemsOOPs;

public class ChargingStation {
    static int totalStations;
    static double electricityRate;
    String stationID;
    double unitsConsumed;

    ChargingStation(String stationID) {
        this.stationID = stationID;
        totalStations++;
    }

    double calculateBill() {
        return (unitsConsumed * electricityRate);
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationID);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
    }

    public static void main(String[] args) {

        ChargingStation.electricityRate = 8.5;

        ChargingStation s1 = new ChargingStation("CS101");
        ChargingStation s2 = new ChargingStation("CS102");
        ChargingStation s3 = new ChargingStation("CS103");
        ChargingStation s4 = new ChargingStation("CS104");
        ChargingStation s5 = new ChargingStation("CS105");

        s1.unitsConsumed = 100;
        s2.unitsConsumed = 120;
        s3.unitsConsumed = 150;
        s4.unitsConsumed = 180;
        s5.unitsConsumed = 200;

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        ChargingStation.electricityRate = 10.0;

        System.out.println("\nAfter Electricity Rate Change:");

        System.out.println("CS101 Bill: " + s1.calculateBill());
        System.out.println("CS102 Bill: " + s2.calculateBill());
        System.out.println("CS103 Bill: " + s3.calculateBill());
        System.out.println("CS104 Bill: " + s4.calculateBill());
        System.out.println("CS105 Bill: " + s5.calculateBill());
    }
}
