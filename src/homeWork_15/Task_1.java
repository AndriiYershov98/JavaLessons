package homeWork_15;

public class Task_1 {
    public static void main(String[] args) {
        Worker human1 = new Worker("Jack","Surgeon",13,6500, "Hospital");

        human1.healing();
        human1.mentoring();
        human1.healing();

        System.out.println();

        human1.whoAmI();

        System.out.println("==================================");

        Worker human2 = new Worker("Sally", "Manager", 7, 4200, "Factory");


        human2.count();
        human2.managing();
        human2.learning();

        System.out.println();

        human2.whoAmI();

        System.out.println("==================================");

        Worker human3 = new Worker("Robert", "Police officer", 28, 5450, "Police station");


        human3.arrest();
        human3.patrol();
        human3.defending();

        System.out.println();

        human3.whoAmI();

        System.out.println("==================================");


    }
}
