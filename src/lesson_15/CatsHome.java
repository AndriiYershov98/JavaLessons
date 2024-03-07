package lesson_15;

public class CatsHome {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.speaking();
        cat.running();
        cat.sleep();

        System.out.println("===============================");



        String catName = cat.name;

        cat.whoAmI();
        System.out.println("Имя: " + catName);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет: " + cat.colour);
        System.out.println("===============================");

        //Создаем еще один Обьект класса Cat

        Cat cat1 = new Cat("Бутька");

        cat1.running();
        cat1.sleep();
        System.out.println("===============================");

        cat1.whoAmI();
        System.out.println("Имя: " + cat1.name);
        System.out.println("Возраст: " + cat1.age);
        System.out.println("===============================");

        System.out.println("First cat name: " + cat.name);

    }
}
