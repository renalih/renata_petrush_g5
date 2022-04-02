package main.java.tasks.homework.week7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadTaskThree {
    public static void main(String[] args) {

        for (int j = 0; j < 7; j++) {
            new Thread(() -> {
                try {
                    oddMice();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }

    public static void oddMice() throws InterruptedException {
        List<Mouse> mice = IntStream.rangeClosed(1, 26).boxed().map(Mouse::new).collect(Collectors.toList());
        for (int i = 0; i < mice.size(); i++) {
            if (i % 2 == 0) {
                mice.get(i).peep();
            }
        }

    }
}
