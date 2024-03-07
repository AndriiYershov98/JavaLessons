package homeWork_22;

public class AthleteAmatheur extends Human{
    public AthleteAmatheur(int distance) {
        super(distance);
    }

    @Override
    public void run(int speed) {
        System.out.println("Athlete runs " + speed + "km/h");
        speed = 15;
        restAfterRun(10);
    }

    @Override
    public void restAfterRun(int time) {
        super.restAfterRun(time);
    }
}
