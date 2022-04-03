package main.java.tasks.homework.week7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadTaskFive {

    static List<Mouse> mice = IntStream.rangeClosed(1, 380).boxed().map(Mouse::new).collect(Collectors.toList());

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            new Thread(() ->
            {
                try {
                    deletionOddMice();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }


    synchronized public static void deletionOddMice() throws InterruptedException {
        for (int i = 0; i < mice.size(); i++) {
            if(i % 2 == 0) {
                Thread.sleep(250);
                mice.get(i).peep();
                mice.remove(i);
            }
        }

    }
}
