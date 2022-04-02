package main.java.tasks.homework.week7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadTaskTwo {

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            new Thread(() -> {
                System.out.println("Order of threads start " + Thread.currentThread().getName());
                List<Mouse> mice = IntStream.rangeClosed(1, 18).boxed().map(Mouse::new).
                        collect(Collectors.toList());
                for (int j = 0; j < mice.size(); j++) {
                    if (j % 2 != 0) {
                        try {
                            mice.get(j).peep();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("Order of threads finish " + Thread.currentThread().getName());
            }).start();

        }
    }
}
