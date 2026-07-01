import java.util.*;

class Astronaut {
    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return astronautId + " " + name + " " + specialization;
    }
}

class SpaceMissionCrewManagementSystem {
    HashMap<String, List<Astronaut>> missions = new HashMap<>();
    HashMap<String, HashSet<String>> assigned = new HashMap<>();

    void addMission(String mission) {
        missions.putIfAbsent(mission, new ArrayList<>());
        assigned.putIfAbsent(mission, new HashSet<>());
        System.out.println("Mission Added");
    }

    void assignAstronaut(String mission, Astronaut a) {
        if (!missions.containsKey(mission)) {
            System.out.println("Mission Not Found");
            return;
        }

        if (assigned.get(mission).add(a.astronautId)) {
            missions.get(mission).add(a);
            System.out.println("Astronaut Assigned");
        } else {
            System.out.println("Duplicate Assignment Not Allowed");
        }
    }

    void displayMissions() {
        for (String mission : missions.keySet()) {
            System.out.println("\nMission: " + mission);

            List<Astronaut> crew = missions.get(mission);

            for (Astronaut a : crew) {
                System.out.println(a);
            }

            System.out.println("Total Astronauts: " + crew.size());
        }
    }

    public static void main(String[] args) {
        SpaceMissionCrewManagementSystem obj = new SpaceMissionCrewManagementSystem();

        obj.addMission("Chandrayaan");
        obj.addMission("Gaganyaan");

        Astronaut a1 = new Astronaut("A101", "Rohan", "Pilot");
        Astronaut a2 = new Astronaut("A102", "Aman", "Engineer");
        Astronaut a3 = new Astronaut("A103", "Priya", "Scientist");

        obj.assignAstronaut("Chandrayaan", a1);
        obj.assignAstronaut("Chandrayaan", a2);
        obj.assignAstronaut("Chandrayaan", a1);

        obj.assignAstronaut("Gaganyaan", a1);
        obj.assignAstronaut("Gaganyaan", a3);

        obj.displayMissions();
    }
}
