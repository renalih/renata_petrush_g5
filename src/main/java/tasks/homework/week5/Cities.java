package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String s : cities) {
            System.out.println(s);
        }

        int sum = 0;
        for (String s : cities) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    count++;
                }
            }
            sum += count;

        }
        System.out.println(sum);

        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
