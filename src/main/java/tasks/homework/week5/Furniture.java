package main.java.tasks.homework.week5;

import main.java.tasks.homework.week5.zerotask.Chair;

import java.util.*;

public class Furniture {
    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2),
                new Chair(4, 2), new Chair(2, 4)));

        for (Chair ch : furniture) {
            int multiply = ch.getHeight() * ch.getWidth();
            System.out.print(multiply + " ");
        }

        System.out.println("\n");

        Map<Integer, Chair> mapChairs = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            mapChairs.put(i, furniture.get(i));
        }

        for (Map.Entry<Integer, Chair> entry : mapChairs.entrySet()) {
            System.out.println(entry.getKey());
        }

        for (Map.Entry<Integer, Chair> entry : mapChairs.entrySet()) {
            System.out.println(entry.getValue());
        }

        for (Map.Entry<Integer, Chair> entry : mapChairs.entrySet()) {
            System.out.println(entry);
        }
    }
}
