package lesson_24.printers;

public class Book implements Printable{

   private String title;
   private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }



    public void bookSayHello(){
        System.out.println("Hello, " + title);
    }


    @Override
    public void sayHello(String string) {
        System.out.println("Override Method sayHello " + string);
    }

    @Override
    public void print() {
        System.out.println("Book printed " + title + " (author: " + author + ")");
    }
}
