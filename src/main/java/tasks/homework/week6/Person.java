package main.java.tasks.homework.week6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>(100);

        IntStream.rangeClosed(1, 100).boxed().map(number -> new Person("NameTest" + number,
                "SurnameTest" + number, number < 15 || number > 30 ? new Random().ints(15,
                30).findFirst().getAsInt() : number)).filter(x -> x.getAge() < 21).
                peek(System.out::println).sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4).collect(Collectors.toList()).forEach(System.out::println);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

