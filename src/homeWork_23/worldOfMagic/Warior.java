package homeWork_23.worldOfMagic;

public class Warior extends GameCharacter{



    public Warior(int healthPoint) {
        super(healthPoint);
    }

    @Override
    protected void attack() {
        System.out.println("Warrior attacked enemy with! " + healthPoint);
    }
}
