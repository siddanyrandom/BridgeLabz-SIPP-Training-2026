class RescueTeam {
    String teamId;
    String location;

    RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    void performDuty() {
        System.out.println("Rescue Team is performing duty.");
    }
}

class MedicalTeam extends RescueTeam {

    MedicalTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println("Medical Team " + teamId + " is treating injured people at " + location);
    }
}

class FireRescueTeam extends RescueTeam {

    FireRescueTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println("Fire Rescue Team " + teamId + " is controlling fire at " + location);
    }
}

class FoodSupplyTeam extends RescueTeam {

    FoodSupplyTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println("Food Supply Team " + teamId + " is distributing food at " + location);
    }
}

public class DisasterRescueManagement {

    static void findTeamByLocation(RescueTeam[] teams, String location) {

        boolean found = false;

        for (RescueTeam team : teams) {
            if (team.location.equalsIgnoreCase(location)) {
                System.out.println("Team ID: " + team.teamId);
                System.out.println("Location: " + team.location);
                team.performDuty();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No team found at " + location);
        }
    }

    static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {

        System.out.println("\nTeams whose ID starts with \"" + prefix + "\":");

        for (RescueTeam team : teams) {
            if (team.teamId.startsWith(prefix)) {
                System.out.println(team.teamId + " - " + team.location);
            }
        }
    }

    static void performAllDuties(RescueTeam[] teams) {

        int medical = 0;
        int fire = 0;
        int food = 0;

        System.out.println("\nPerforming Duties:\n");

        for (RescueTeam team : teams) {

            team.performDuty();

            if (team instanceof MedicalTeam)
                medical++;
            else if (team instanceof FireRescueTeam)
                fire++;
            else if (team instanceof FoodSupplyTeam)
                food++;
        }

        System.out.println("\nDeployment Count:");
        System.out.println("Medical Teams: " + medical);
        System.out.println("Fire Rescue Teams: " + fire);
        System.out.println("Food Supply Teams: " + food);

        System.out.print("\nMaximum Deployments: ");

        if (medical >= fire && medical >= food)
            System.out.println("Medical Team");
        else if (fire >= medical && fire >= food)
            System.out.println("Fire Rescue Team");
        else
            System.out.println("Food Supply Team");
    }

    public static void main(String[] args) {

        RescueTeam[] teams = {
                new MedicalTeam("MT101", "Delhi"),
                new FireRescueTeam("FT201", "Mumbai"),
                new FoodSupplyTeam("FS301", "Delhi"),
                new MedicalTeam("MT102", "Lucknow"),
                new FireRescueTeam("FT202", "Delhi")
        };

        performAllDuties(teams);

        System.out.println("\nSearch by Location (Delhi):");
        findTeamByLocation(teams, "Delhi");

        displayTeamsByPrefix(teams, "MT");
    }
}
