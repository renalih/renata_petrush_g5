package main.java.tasks.homework.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TaskOne {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                mouseCreation();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                mouseCreation();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                mouseCreation();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t4 = new Thread(() -> {
            try {
                mouseCreation();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t5 = new Thread(() -> {
            try {
                mouseCreation();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    public static void mouseCreation() throws InterruptedException {
        List<Mouse> mice = IntStream.rangeClosed(1, 20).boxed().map(count -> new Mouse(count)).limit(20).
                collect(Collectors.toList());
        for (Mouse m : mice) {
            m.peep();
        }
    }
}
