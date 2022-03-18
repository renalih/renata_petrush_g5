package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андоррa");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        System.out.println("Список стран: ");

        for (String s : countries) {
            System.out.print(s + ", ");     //String.join(", ", countries)
        }

        System.out.println("\n");

        int sum = 0;

        for (String s : countries) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    count++;
                }
            }
            if (count < 7) {
                sum++;
            }
        }
        System.out.println("Количество стран с менее 7 букв в названии: " + sum);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
