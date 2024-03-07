package lesson_24.printers;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Java", "Eckel");

        book.print();
        book.bookSayHello();


        Printable book1 = new Book("Test", "George");

        book1.print();
//        book1.bookSayHello(); // такой метод по типу ссылки Printable не доступен так как его нет в интерфейсе Printable

        Printable presentationWB = new Presentation("Title", 24, "Java");

        presentationWB.print();
        System.out.println("========================");

        ColourPrintable colourPresentation = new Presentation("Colour", 12, "colour world");

        colourPresentation.colourPrint();
        colourPresentation.print();

        System.out.println("========================");

        Printable[] printables = new Printable[2];
        printables[0] = book;
        printables[1] = colourPresentation;

        for (Printable printable : printables) {
            printable.print();
            printable.sayHello("World!");
        }

        System.out.println("========================");
        // Вывод статического метода интерфейса
        Printable.staticMethod();

        Printer printer = new Printer();

        printer.makeCopy(book);
        printer.makeCopy(presentationWB);
        printer.makeCopy(colourPresentation);






    }
}
