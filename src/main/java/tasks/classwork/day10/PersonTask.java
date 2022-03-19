package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonTask {
    public static void main(String[] args) {
        List<Person> personList =
        Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        int count = 0;
        for (Person p : personList) {
            if(p.age > 18 && p.age < 55 && p.sex == Person.Sex.WOMEN ||
                    p.age > 18 && p.age < 60 && p.sex == Person.Sex.MAN) {
                count++;
            }
        }
        System.out.println(count);

        //2 способ через стрим
        long l = personList.stream().filter(x -> x.age >= 18).filter(x -> (x.age < 55) ||
                (x.sex == Person.Sex.MAN && x.age < 60)).count();
        System.out.println(l);
    }
}
