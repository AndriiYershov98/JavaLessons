package homeWork_22;

public class Human {


    private int distance;

    public Human(int distance) {

        this.distance = distance;
    }

    public void run(int speed) {
        System.out.println("Athlete runs " + speed + "km/h");
        speed = 10;
        System.out.println("Athlete run " + distance);
        restAfterRun(15);
    }


    public void restAfterRun(int time){
        System.out.println("Athlete rests " + time + " minutes");
    }
}
