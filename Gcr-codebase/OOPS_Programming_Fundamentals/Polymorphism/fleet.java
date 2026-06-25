abstract class Vehicle {
    abstract double fuelCost(double km);
}

class Car extends Vehicle {
    @Override
    double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    @Override
    double fuelCost(double km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    @Override
    double fuelCost(double km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    @Override
    double fuelCost(double km) {
        return km * 2;
    }
}

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        double km = 20;

        for (Vehicle v : vehicles) {

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Car Fuel Cost: " + c.fuelCost(km));
            } 
            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Bus Fuel Cost: " + b.fuelCost(km));
            } 
            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("Bike Fuel Cost: " + b.fuelCost(km));
            } 
            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("Electric Car Fuel Cost: " + e.fuelCost(km));
            }
        }
    }
}
