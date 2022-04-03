package main.java.tasks.homework.week7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadTaskSix {

    static List<Mouse> mice = IntStream.rangeClosed(1, 420).boxed().map(Mouse::new).collect(Collectors.toList());

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                try {
                    deletionEvenMice();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public synchronized static void deletionEvenMice() throws InterruptedException {
        for (int i = 0; i < mice.size(); i++) {
            if (i % 2 != 0) {
                mice.get(i).peep();
                mice.remove(i);
                Thread.sleep(170);
            }
        }
    }
}
