import java.util.*;

class SmartCityTrafficMonitoringSystem {
    HashMap<String, Integer> traffic = new HashMap<>();

    void addOrUpdateRoad(String road, int vehicles) {
        traffic.put(road, traffic.getOrDefault(road, 0) + vehicles);
        System.out.println("Traffic Updated");
    }

    void displayRoads() {
        TreeMap<String, Integer> sorted = new TreeMap<>(traffic);

        System.out.println("\nRoads in Sorted Order:");
        for (String road : sorted.keySet()) {
            System.out.println(road + " : " + sorted.get(road));
        }
    }

    void busiestRoad() {
        String road = "";
        int max = 0;

        for (String r : traffic.keySet()) {
            if (traffic.get(r) > max) {
                max = traffic.get(r);
                road = r;
            }
        }

        System.out.println("\nBusiest Road: " + road);
        System.out.println("Vehicles: " + max);
    }

    void trafficReport() {
        System.out.println("\nTraffic Report:");
        for (String road : traffic.keySet()) {
            System.out.println(road + " : " + traffic.get(road) + " vehicles");
        }

        System.out.println("Total Roads: " + traffic.size());
    }

    public static void main(String[] args) {
        SmartCityTrafficMonitoringSystem obj = new SmartCityTrafficMonitoringSystem();

        obj.addOrUpdateRoad("MG Road", 120);
        obj.addOrUpdateRoad("NH44", 250);
        obj.addOrUpdateRoad("Ring Road", 180);
        obj.addOrUpdateRoad("MG Road", 80);

        obj.displayRoads();
        obj.busiestRoad();
        obj.trafficReport();
    }
}
