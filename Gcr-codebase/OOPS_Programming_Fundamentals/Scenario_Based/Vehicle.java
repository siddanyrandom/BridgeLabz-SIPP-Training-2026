package ScenarioBasedProblemsOOPs;

public class Vehicle {
    int vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(int vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main() {

        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Vehicle(101, "Yashu", "Car");
        vehicles[1] = new Vehicle(102, "Aman", "Bike");
        vehicles[2] = new Vehicle(103, "Rohit", "Truck");
        vehicles[3] = new Vehicle(104, "Neha", "Bike");
        vehicles[4] = new Vehicle(105, "Priya", "Car");
        vehicles[5] = new Vehicle(106, "Karan", "Gypsy");
        vehicles[6] = new Vehicle(107, "Simran", "Car");
        vehicles[7] = new Vehicle(108, "Ankit", "Bike");
        vehicles[8] = new Vehicle(109, "Pooja", "Car");
        vehicles[9] = new Vehicle(110, "Vikas", "Truck");

        displayCars(vehicles);
        displayBikes(vehicles);

    }
}
