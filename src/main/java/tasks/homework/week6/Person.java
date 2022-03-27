package main.java.tasks.homework.week6;

import java.util.*;
import java.util.stream.Collectors;
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

        for (int i = 0; i < 101; i++) {
            people.add(new Person("A", "C", 13));
        }
        System.out.println(people);

        //Stream.generate(() -> new Person("a", "b", 13 )).limit(100).collect(Collectors.toList());



    }
}
