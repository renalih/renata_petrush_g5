package main.java.tasks.homework.week7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadTaskFour {
    public static void main(String[] args) {

        List<Mouse> mice = IntStream.rangeClosed(1, 280).boxed().map(Mouse::new).
                collect(Collectors.toList());

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                while (!mice.isEmpty()) {
                    try {
                        mice.remove(0).peep();
                        Thread.currentThread().sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }
}
