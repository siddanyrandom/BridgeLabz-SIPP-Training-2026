import java.util.HashSet;

class EventEntryVerificationSystem {
    HashSet<String> participants = new HashSet<>();

    void registerParticipant(String email) {
        if (participants.add(email))
            System.out.println("Registration Successful");
        else
            System.out.println("Duplicate Registration Not Allowed");
    }

    void displayParticipants() {
        System.out.println("Registered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {
        EventEntryVerificationSystem obj = new EventEntryVerificationSystem();

        obj.registerParticipant("john@gmail.com");
        obj.registerParticipant("alice@gmail.com");
        obj.registerParticipant("bob@gmail.com");
        obj.registerParticipant("john@gmail.com");

        obj.displayParticipants();
    }
}
