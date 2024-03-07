package lesson_38;

import java.util.*;

public class JavaSetExample {



    public static void main(String[] args) {
        /*
        Контракт между hashCode() и equals()
        1. Елси 2 обьекта равны между собой по equals(), то их хешколы тоже должны быть равны между собой
        2. Если хеш-коды двух обьектов различны, то эти обьекты абсолютно точно не равны по методу equals().
        3. Вызов метода hashCode() должен возвращать одинаковое значение при многократных вызовах на изменненныом обьекте

         */

        Set<Integer> integersConstruct = new HashSet<>(); // 16 корзин, loadFactor 0.75
        Set<Integer> integers1 = new HashSet<>(28); //32 корзины (ближайшая степень двойки) задаём значение корзин, loadFactor 0.75
        Set<Integer> integers2 = new HashSet<>(28,0.80f); //32 корзины (ближайшая степень двойки) задаём значение корзин, задаем loadFactor 0.80
        Set<Integer> integers3 = new HashSet<>(integersConstruct); // Принимает коллекцию и создает set из уникальных элементов этой коллекции

        Set<Integer> integers = new HashSet<>();
        System.out.println(integers);

//        Set<String> strings = new HashSet<>(List.of("String", "Java", "Python", "hello"));
//        System.out.println(strings);
//
        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 5, 6, 8, 8, 15, 7, 0, 16, 32, 64);

        //Сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);

        System.out.println(linkedSet);

        //boolean add(E e) - добавляет
        System.out.println(integers.add(100));// true - элемент добавлен, так как еще не было такого знрачения в set-e
        System.out.println(integers.add(100));// false - элемент НЕ добавлен так как такое значение уже было добавлено в set-e

        //boolean remove(Object obj)
        System.out.println("integers.remove: " + integers.remove(100));
        System.out.println("integers.remove: " + integers.remove(100));

        //boolean contains(Object obj)
        System.out.println(integers.contains(33));

        Set<Integer> treeSet0 = new TreeSet<>(); // пустое, упорядоченое, сортируемое в естественном порядке множество
        Set<Integer> treeSet1 = new TreeSet<>(integers);
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        //Set<Integer> treeSet3 = new TreeSet<>(TreeSet<T>) создает новое множество, содержащее те же элементы в том же порядке


        System.out.println("\n==========================");
        // Task1
        // Написать метод, который принимает список и возвращает список, состоящий из уникальных элементов.

        System.out.println(startValues);
        List<Integer> uniqueList = getUniqueElements(startValues);
        System.out.println(uniqueList);










    }

    public static <T> List<T> getUniqueElements(List<T> list) {
        Set<T> uniqueSet = new HashSet<>(list);
        List<T> uniqueList = new ArrayList<>(uniqueSet);
        return uniqueList;
    }

    public static <T> List<T> getUniqueSortedElements(List<T> list) {
        Set<T> treeSortedReverse =(Set<T>) new TreeSet<>(Comparator.reverseOrder());
        treeSortedReverse.add((T) list);





        return new ArrayList<>(treeSortedReverse);
    }


}
