package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateBill();

    public void displayPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}

class InPatient extends Patient {

    private double roomCharges;
    private double treatmentCharges;

    public InPatient(int patientId, String name, int age, double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public double getTreatmentCharges() {
        return treatmentCharges;
    }

    public void setTreatmentCharges(double treatmentCharges) {
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }
}

class OutPatient extends Patient {

    private double consultationFees;
    private double treatmentCharges;

    public OutPatient(int patientId, String name, int age, double consultationFees, double treatmentCharges) {
        super(patientId, name, age);
        this.consultationFees = consultationFees;
        this.treatmentCharges = treatmentCharges;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public double getTreatmentCharges() {
        return treatmentCharges;
    }

    public void setTreatmentCharges(double treatmentCharges) {
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFees + treatmentCharges;
    }
}

public class HospitalPatientManagementSystem {

    public static void main(String[] args) {

        Patient inPatient = new InPatient(101, "Raj", 40, 5000, 3000);

        Patient outPatient = new OutPatient(102, "Asha", 30, 500, 1500);

        System.out.println("In Patient Details");
        inPatient.displayPatientDetails();
        System.out.println("Total Bill : ₹" + inPatient.calculateBill());

        System.out.println();

        System.out.println("Out Patient Details");
        outPatient.displayPatientDetails();
        System.out.println("Total Bill : ₹" + outPatient.calculateBill());
    }
}
