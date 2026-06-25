class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", Student{studentId=" + studentId + ", gpa=" + gpa + "}";
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() + ", GradStudent{thesis='" + thesis + "'}";
    }
}

public class GradStudentDemo {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent("Yateesh", 22, 101, 8.9, "AI Research");
        System.out.println(gs);
        System.out.println(gs instanceof Student);
        System.out.println(gs instanceof Person);
    }
}
