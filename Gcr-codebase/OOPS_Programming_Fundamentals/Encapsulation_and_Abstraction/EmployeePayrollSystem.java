package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class Employee {

    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(int employeeId,
                            String employeeName,
                            double monthlySalary) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String employeeName, int hoursWorked, double hourlyRate) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Employee fullTimeEmployee = new FullTimeEmployee(101, "John", 50000);

        Employee partTimeEmployee = new PartTimeEmployee(102, "Sam", 80, 300);

        System.out.println("Full Time Employee");
        fullTimeEmployee.displayEmployeeInfo();
        System.out.println("Salary : ₹" +
                fullTimeEmployee.calculateSalary());

        System.out.println();

        System.out.println("Part Time Employee");
        partTimeEmployee.displayEmployeeInfo();
        System.out.println("Salary : ₹" + partTimeEmployee.calculateSalary());
    }
}
