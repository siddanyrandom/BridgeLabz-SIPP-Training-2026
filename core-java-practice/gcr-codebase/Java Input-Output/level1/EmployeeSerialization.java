import java.io.*;
import java.util.*;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name,
             String department, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, dept, salary);

        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream("employee.ser"));

        out.writeObject(emp);
        out.close();

        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("employee.ser"));

        Employee recovered = (Employee) in.readObject();

        System.out.println("\nRecovered Employee Information");
        System.out.println("ID: " + recovered.employeeId);
        System.out.println("Name: " + recovered.name);
        System.out.println("Department: " + recovered.department);
        System.out.println("Salary: " + recovered.salary);

        in.close();
    }
}
