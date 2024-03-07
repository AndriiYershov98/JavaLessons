package homeWork_22;

public class AthleteProfessional extends AthleteAmatheur {
    public AthleteProfessional(int distance) {
        super(distance);
    }

    @Override
    public void run(int speed) {
        System.out.println("Athlete runs " + speed + "km/h");
        speed = 25;
        restAfterRun(5);
    }

    @Override
    public void restAfterRun(int time) {
        super.restAfterRun(time);
    }

}
