package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        //long l = list.stream().filter(x -> x.equals("мама")).count();
        long l = list.stream().filter("мама"::equals).count();
        System.out.println(l);
        list.forEach(System.out::println);

    }
}
