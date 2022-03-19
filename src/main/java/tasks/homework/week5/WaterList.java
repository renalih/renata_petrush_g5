package main.java.tasks.homework.week5;

import main.java.tasks.homework.week5.zerotask.Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterList {
    public static void main(String[] args) {

        List<Water> water = new ArrayList<>(Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный")));

        for(Water w : water) {
            System.out.println(w.getColor() + "-вода");
        }
    }
}
