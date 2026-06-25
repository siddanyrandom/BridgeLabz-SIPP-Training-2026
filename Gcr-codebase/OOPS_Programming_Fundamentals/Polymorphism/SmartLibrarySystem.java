class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibrary {

    public static void main(String[] args) {

        LibraryMember[] members = {
            new StudentMember("Siddhartha", "S101"),
            new FacultyMember("Rahul", "F201"),
            new GuestMember("Priya", "G301")
        };

        int overdueDays = 4;

        System.out.println("Library Members:\n");

        for (LibraryMember member : members) {
            member.printDetails();
            System.out.println("Fine: ₹" + member.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "F201";

        System.out.println("Searching for Member ID: " + searchId);

        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(searchId)) {
                System.out.println("\nMember Found:");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }
}
