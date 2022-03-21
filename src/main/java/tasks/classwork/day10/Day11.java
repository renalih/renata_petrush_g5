package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day11 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        list.stream().anyMatch(x -> x.equals("мама"));
        list.stream().allMatch("м"::contains);
        list.stream().map(x -> x + "м").collect(Collectors.toList()).forEach(System.out::println);
        list.stream().flatMap(x -> Arrays.stream(x.split("а"))).filter(x -> !x.equals("")).
                collect(Collectors.toList()).forEach(System.out::println);

        list.stream().sorted().collect(Collectors.toList());
        list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList());


        List<Person> personList =
                Arrays.asList(
                        new Person("Вася", 13, Person.Sex.MAN),
                        new Person("Катя", 28, Person.Sex.WOMEN),
                        new Person("Вова", 24, Person.Sex.MAN),
                        new Person("Маша", 38, Person.Sex.WOMEN),
                        new Person("Роман Петрович", 72, Person.Sex.MAN)
                );

        personList.stream().sorted ((o1, o2) -> {
            if (o1.sex != o2.sex) {
                return o1.sex.compareTo(o2.sex); //return ()? x:y
            }
            return o1.age - o2.age;
        }).peek (p -> System.out.println(p.name)).collect(Collectors.toList()).forEach(System.out::println);



        String str = list.stream().flatMap(x -> Arrays.stream(x.split(""))).peek(System.out::println).
                max(String::compareTo).get();
        System.out.println(str);

        personList.stream().min(Comparator.comparingInt(x -> x.age)).get();

        //сумма общего количества букв во всех словах коллекции
        list.stream().flatMap(x -> Arrays.stream(x.split(""))).count();
        list.stream().map(x -> x.length());
        list.stream().reduce((x,y) -> x + y).get();
        list.stream().mapToInt(x -> x.length()).sum();

        //найти кол-во букв для нечетных слов
        list.stream().mapToInt(x -> x.length()).filter(x -> x % 2 != 0).sum();
        list.stream().map(String::length).collect(Collectors.summarizingInt(p -> p % 2 == 1? p: 0));

        //объедиение в одну строку через разделитель :
        list.stream().collect(Collectors.joining(":", "<p/>", "</p>"));

        //преобразовать personlist в map с ключом hash и значением сам объект
        personList.stream().collect(Collectors.toMap(x -> x.hashCode(), y -> y));

        //преобразовать personlist в map по полу
        personList.stream().collect(Collectors.groupingBy(x -> x.sex)).keySet().forEach(System.out::println);

    }
}