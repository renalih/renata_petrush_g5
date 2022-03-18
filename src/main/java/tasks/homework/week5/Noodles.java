package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String s : noodles) {
            System.out.print(s + "-");
        }

        System.out.println("\n");

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replaceAll("a", "o"));
            System.out.print(noodles.get(i) + " ");
        }
    }
}




