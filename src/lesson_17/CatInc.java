package lesson_17;

public class CatInc {



    private String name;
    private int age;
    private int weight;
    private String test;


    public CatInc(){

    }

    public void sayMeow(){
        System.out.println("Meow!");
    }

    public CatInc(String test, int age, int weight, String name) {
        this.test = test;
        this.age = age;
        this.weight = weight;
        this.name = name;

    }

    public String getName(){ // геттер для поля Name
        return name;
    }

    public int getAge(){
        return age;
    }

    // Сеттеры

    public void setAge(int age){ // сеттер для поля age

        if (age <= 0){
            System.out.println("Неккоректное значение возврата");
        }else {
            this.age = age;
        }
    }

    public void setName(String name){ // сеттер для поля name
        if (name != null){
            this.name = name;
        } else {
            this.name = "default";
        }

    }

}
