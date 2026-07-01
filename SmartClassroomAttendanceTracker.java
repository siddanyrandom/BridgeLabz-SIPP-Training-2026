import java.util.*;

class SmartClassroomAttendanceTracker {
    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    void markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Attendance Marked");
        } else {
            System.out.println("Duplicate Attendance Not Allowed");
        }
    }

    void displayAttendance() {
        for (String subject : attendance.keySet()) {
            System.out.println("\nSubject: " + subject);
            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students: " + students.size());
        }
    }

    public static void main(String[] args) {
        SmartClassroomAttendanceTracker obj = new SmartClassroomAttendanceTracker();

        obj.markAttendance("Java", "Alice");
        obj.markAttendance("Java", "Bob");
        obj.markAttendance("Java", "Alice");

        obj.markAttendance("Python", "John");
        obj.markAttendance("Python", "David");
        obj.markAttendance("Python", "John");

        obj.displayAttendance();
    }
}
