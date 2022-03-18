package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class DemoVegetables {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картофель");

        for(String s : vegetables) {
            System.out.print(s + " ");
        }

        System.out.println('\n');

        int count = 0;
        for (String s : vegetables) {
            if(s.contains("а")) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println('\n');

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }

        vegetables.remove("Огурец");
        vegetables.remove(3);

    }
}
