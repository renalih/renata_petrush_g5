package main.java.tasks.homework.week7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadTaskSeven {

    static List<Object> mice = IntStream.rangeClosed(1, 240).boxed().map(Mouse::new).collect(Collectors.toList());

    public static void main(String[] args) {
    }

    public synchronized static void deleteUnevenMice() throws InterruptedException {
        for (int i = 0; i < mice.size(); i++) {
            if (i % 2 == 0) {
               // mice.get(i).peep();
                mice.remove(i);
                Thread.sleep(250);
            }
        }
    }

    public synchronized static void replaceEvenMice() throws InterruptedException {
        for (int i = 0; i < mice.size(); i++) {
            if (i % 2 != 0) {
                //mice.get(i).peep();
                mice.remove(i);
                Thread.sleep(220);
            }
        }
    }
}
