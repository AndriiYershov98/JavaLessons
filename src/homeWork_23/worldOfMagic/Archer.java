package homeWork_23.worldOfMagic;

public class Archer extends GameCharacter{
    public Archer(int healthPoint) {
        super(healthPoint);
    }

    @Override
    protected void attack() {
        System.out.println("Archer attacked with! " + healthPoint);

    }
}
