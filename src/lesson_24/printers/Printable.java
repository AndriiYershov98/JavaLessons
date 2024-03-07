package lesson_24.printers;

public interface Printable {



    /*
    Интерфейсы абстрактный косвенно (по умолчанию). Нам не нужно  использовать ключевые слова ABSTRACT и PUBLIC


     */
    void print();

// Методы по умолчанию.

   default void sayHello(String string){
       System.out.println("Hello, " + string);
   }

   static void staticMethod(){
       System.out.println("I'm static");
   }


   // Начиная с JDK 9 мы можем определять private методы.
    //приватные методы интерфейса мы не можем переопределить

    private void privateMethod(){
        System.out.println("I'm private");
    }


    // у интерфейса могут быть определены статические константы


















}
