package lesson_16;

public class Cat {

        String name;
        String colour;
        int age;
/*
Конструктор - это специальный метод который автоматически вызывается при создании обьекта этого класса.
Освновная задача конструктора инициализировать новый обьект (установить какие-то начальные значения свойств или полей).
Второстепенно мы можем выполнить какие-то другие начальные настройки обьекта.
Особенности конструктора класса
1. Имя конструктора ВСЕГДА совпадает с названием класса!
2. Конструктор не имеет возвращаемого типа(даже void не указываем), так как конструктор автоматически вовращает экземпляр класса.
3. Конструктор вызывается автоматически при создании обьекта. Это происходит при использовании оператора new.
 */



// Ключевое слово this используется внутри класса - для указания на текущий обьект.



        public Cat() {//Вид конструктора по умолчанию.

            System.out.println("Конструктор");
            this.name = "Alfred";
            this.colour = "Yellow";
            this.age = 8;

        }

        public Cat(String catname){
            name = catname;
        }
        public Cat(String name, String colour){
            System.out.println("Конструктор с двумя строками: ");
                this.name = name;
            this.colour = colour;

        }

        public Cat(String name, String colour, int age){
                    this.name = name;
                    this.colour = colour;
                    this.age = age;
            System.out.println("Конструктор с трёмя строками: ");
        }
        public void whoAmI(){
            System.out.println("I'm cat: " + name + " My age is: " + age +
                    " My colour is: " + colour);
            System.out.println("");
        }



        void sleep  (){

            System.out.println("I'm sleeping");
        }

        void speaking (){

            System.out.println("Meow");
        }

        void running (){

            System.out.println("Running");


        }

}
