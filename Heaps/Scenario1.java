package Heaps;

import java.util.PriorityQueue;

public class Scenario1 {
    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();
        er.addPatient(new Patient("A", 5));
        er.addPatient(new Patient("B", 10));
        er.addPatient(new Patient("C", 7));
        while (!er.pq.isEmpty()) {
            Patient p = er.treatNext();
            System.out.println(p.name + " " + p.severity);
        }
    }

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    static class EmergencyRoom {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);

        void addPatient(Patient p) {
            pq.offer(p);
        }

        Patient treatNext() {
            return pq.poll();
        }
    }
}
