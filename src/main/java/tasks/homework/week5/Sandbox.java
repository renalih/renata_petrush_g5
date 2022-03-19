package main.java.tasks.homework.week5;

import main.java.tasks.homework.week5.zerotask.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {
    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand s : sandbox) {
            System.out.print(s.getWeight() + " ");
        }

        System.out.println("\n");

        for (Sand s : sandbox) {
            System.out.print(s.getName() + " ");
        }

        System.out.println("\n");

        Map<Integer, Sand> sandsList = new HashMap<>();

        /*for (Map.Entry<Integer, Sand> entry : sandsList.entrySet()) {
            entry.setValue(sandbox.add())*/


    }


}
