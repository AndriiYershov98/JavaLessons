package homeWork_23.worldOfMagic;

public class Wizard extends GameCharacter{
    public Wizard(int healthPoint) {
        super(healthPoint);
    }

    @Override
    protected void attack() {
        System.out.println("Wizard attacked with! " + healthPoint);

    }
}
