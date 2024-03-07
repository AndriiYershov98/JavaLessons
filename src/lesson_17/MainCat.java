package lesson_17;

public class MainCat {
    public static void main(String[] args) {
        CatInc cat = new CatInc("Test", 10, 5, "Name");

        cat.sayMeow();

        String catName = cat.getName(); // с помощью геттера получили значени поля name для текущего обьекта

        int catAge = cat.getAge(); // с помощью шеттера получили возраст обьекта

        System.out.println(catName + " : " + catAge);

        cat.setAge(-15);

        System.out.println("getAge: " + cat.getAge());

        cat.setName("Ball");
        System.out.println("catName():" + cat.getName());






    }


}
