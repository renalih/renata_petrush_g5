package main.java.tasks.homework.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inches {
    public static void main(String[] args) {
        List<Integer> listlengths = new ArrayList<>(Arrays.asList
                (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        double l = listlengths.stream().filter(x -> x % 2 == 0).peek(System.out::println).
                mapToDouble(x -> (double) (x * 2.54)).sum();
        System.out.println(l);

    }
}
