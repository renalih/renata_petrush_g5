package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {

        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String s : birds) {
            System.out.println("--" + s + "--");
        }

        int sum = 0;

        for (String s : birds) {
            int vowels = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'а' || ch == 'у' || ch == 'о' || ch == 'ы' || ch == 'и' ||
                        ch == 'э' || ch == 'я' || ch == 'ю' || ch == 'ё' || ch == 'е') {
                    vowels++;
                }
            }

            if (vowels > 1) {
                sum++;
            }
        }
        System.out.println("Количество названий птиц, где больше 1 гласной: "  + sum);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        System.out.println("\n");

        birds.set(3, "Синица");

        for (String s : birds) {
            System.out.print(s + " ");
        }
    }
}

