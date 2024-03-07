package lesson_24.printers;

public class Presentation implements ColourPrintable{


    public Presentation(String title, int countPages, String theme) {
        this.title = title;
        this.countPages = countPages;
        this.theme = theme;
    }

    private String title;
    private int countPages;
    private String theme;








    @Override
    public void colourPrint() {
        System.out.printf("Презентиация %s в цвете (тема: %s). Всего страниц %d\n", title, theme, countPages);
    }

    @Override
    public void print() {
        System.out.printf("Распечатывается презентиация %s (тема: %s) в ч/б. Всего страниц %d\n", title, theme, countPages);
    }
}
