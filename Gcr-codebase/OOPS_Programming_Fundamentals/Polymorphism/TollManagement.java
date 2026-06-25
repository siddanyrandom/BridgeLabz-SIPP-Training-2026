class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class SmartVehicleTollManagement {

    static void calculateTotalRevenue(Vehicle[] vehicles) {

        double totalRevenue = 0;
        double highestToll = 0;
        Vehicle highestVehicle = null;

        int carCount = 0;
        int busCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicles) {

            double toll = vehicle.calculateToll();
            totalRevenue += toll;

            if (toll > highestToll) {
                highestToll = toll;
                highestVehicle = vehicle;
            }

            if (vehicle instanceof Car) {
                carCount++;
            } else if (vehicle instanceof Bus) {
                busCount++;
            } else if (vehicle instanceof Truck) {
                truckCount++;
            }
        }

        System.out.println("Total Revenue: ₹" + totalRevenue);

        System.out.println("\nVehicle with Highest Toll:");
        System.out.println("Vehicle Number: " + highestVehicle.vehicleNumber);
        System.out.println("Owner Name: " + highestVehicle.ownerName);
        System.out.println("Toll Paid: ₹" + highestToll);

        System.out.println("\nVehicle Count:");
        System.out.println("Cars: " + carCount);
        System.out.println("Buses: " + busCount);
        System.out.println("Trucks: " + truckCount);
    }

    static void searchVehicle(Vehicle[] vehicles, String vehicleNumber) {

        boolean found = false;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.vehicleNumber.equals(vehicleNumber)) {
                System.out.println("\nVehicle Found:");
                System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
                System.out.println("Owner Name: " + vehicle.ownerName);
                System.out.println("Toll: ₹" + vehicle.calculateToll());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nVehicle not found.");
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("UP85AB1234", "Siddhartha"),
                new Bus("DL01CD5678", "Rahul"),
                new Truck("HR26EF9012", "Priya"),
                new Car("UP32GH3456", "Aman"),
                new Truck("RJ14JK7890", "Neha")
        };

        calculateTotalRevenue(vehicles);

        searchVehicle(vehicles, "HR26EF9012");
    }
}
