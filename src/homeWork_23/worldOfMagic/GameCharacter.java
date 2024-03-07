package homeWork_23.worldOfMagic;

public abstract class GameCharacter {


    protected int healthPoint;

    protected abstract void attack();

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public GameCharacter(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
