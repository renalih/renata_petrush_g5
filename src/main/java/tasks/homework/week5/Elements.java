package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String s : elements) {
            System.out.print(s + " ");
        }

        System.out.println("\n");

        int count = 0;
        for (String s : elements) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == ' ' || ch == '-') {
                    count++;
                }
            }
        }
        System.out.println("Количество составных названий элементов "  + count);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        System.out.println("\n");

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for(String s : elements) {
            System.out.print(s + " ");
        }
    }
}
