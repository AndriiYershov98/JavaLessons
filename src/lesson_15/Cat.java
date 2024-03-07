package lesson_15;

public class Cat {

        String name;
        String colour;
        int age;

        public Cat() { //Вид конструктора по умолчанию.

        }

        public Cat(String catname){
            name = catname;
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
