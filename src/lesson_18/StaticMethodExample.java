package lesson_18;

public class StaticMethodExample {
    public static void main(String[] args) {

        int sum = MathUnils.sumOfInts(1, 4, 5, 6);
        System.out.println("sum: " + sum);


        Car car = new Car("Test", 100);
        Car car1 = new Car("Car", 200);

        car.info();
        System.out.println(Car.getCountCar());

        /*
        1. Не-статические методы могут обращатся к нестатическим полям и методам
        2. Не-статические методы могут обращатся к статическим полям и методам
        3. Статитечские методы могут обращатся к статическим полям и методам
        4. Статитечские методы НЕ могут обращатся к НЕ-статическим полям и методам
         */


    }
}
