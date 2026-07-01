import java.util.ArrayList;

class SmartParkingSlotManager {
    ArrayList<String> parking = new ArrayList<>();

    void addVehicle(String regNo) {
        parking.add(regNo);
        System.out.println("Vehicle Added");
    }

    void removeVehicle(String regNo) {
        if (parking.remove(regNo))
            System.out.println("Vehicle Removed");
        else
            System.out.println("Vehicle Not Found");
    }

    void searchVehicle(String regNo) {
        if (parking.contains(regNo))
            System.out.println("Vehicle is Parked");
        else
            System.out.println("Vehicle is Not Parked");
    }

    void displayVehicles() {
        System.out.println("Parked Vehicles:");
        for (String vehicle : parking) {
            System.out.println(vehicle);
        }
        System.out.println("Total Occupied Slots: " + parking.size());
    }

    public static void main(String[] args) {
        SmartParkingSlotManager obj = new SmartParkingSlotManager();

        obj.addVehicle("UP85AB1234");
        obj.addVehicle("DL01XY5678");
        obj.addVehicle("HR26CD9876");

        obj.searchVehicle("DL01XY5678");

        obj.removeVehicle("UP85AB1234");

        obj.displayVehicles();
    }
}
