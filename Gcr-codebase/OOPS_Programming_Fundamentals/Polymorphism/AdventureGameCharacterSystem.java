class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " attacks!");
    }
}

class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " attacks with a Sword!");
    }
}

class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts a Fireball!");
    }
}

class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots an Arrow!");
    }
}

public class AdventureGame {

    static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("Battle Started!\n");

        for (GameCharacter character : characters) {

            character.performAttack();

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\nBattle Summary:");
        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
            new Warrior("Aragorn"),
            new Mage("Gandalf"),
            new Archer("Legolas"),
            new Warrior("Leon"),
            new Archer("Robin")
        };

        startBattle(characters);
    }
}
