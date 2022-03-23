package main.java.tasks.homework.week6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreeFive {
    public static void main(String[] args) {
        int n = 100;
        IntStream.range(0, n).filter(x -> x % 3 == 0).filter(x -> x % 5 == 0).forEach(System.out::println);

    }
}
