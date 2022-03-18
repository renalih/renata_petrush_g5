package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (double d : doubles) {
            System.out.println(d + " ");
        }

        double multiply = 1;
        for (int i = 0; i < doubles.size(); i++) {
            multiply = multiply * doubles.get(i);
        }
        System.out.println("Произведение всех чисел" + multiply);

        double sum = 0;
        for (double d : doubles) {

        }
    }
}
