package homeWork_23.worldOfMagic;

public class Main {
    public static void main(String[] args) {


        GameCharacter warrior = new Warior(100);
        GameCharacter archer = new Archer(75);
        GameCharacter wizard = new Wizard(50);


        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = warrior;
        characters[1] = archer;
        characters[2] = wizard;

        for (GameCharacter character : characters) {
            character.attack();
        }

    }
}
