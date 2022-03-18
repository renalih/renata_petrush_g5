package main.java.tasks.homework.week5;

import main.java.tasks.homework.week5.zerotask.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubblesList {
    public static void main(String[] args) {

        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"),
                new Bubble(4, "O2"), new Bubble(5, "CO")));

        for (Bubble b : bubbles) {
            System.out.print(b.getVolume() + " ");
        }

        System.out.println("\n");

        for (Bubble b : bubbles) {
            System.out.print(b.getName() + " ");
        }

        int v = 0;
        for (Bubble b : bubbles) {
            v += b.getVolume();
        }
        System.out.println("\n" + "Объём всех пузырей равен: " + v);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i)); //bubbles.toString()
        }
    }
}
