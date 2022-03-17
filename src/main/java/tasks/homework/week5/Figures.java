package main.java.tasks.homework.week5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        BufferedWriter out = new BufferedWriter(new FileWriter("figures.txt"));
        for(String s : figures) {
            out.write(s + "-");
        }
        out.close();

        int counter = 0;
        for(String s : figures) {
            if(s.contains("и")) {
                counter++;
            }
        }
        int noI = figures.size() - counter;
        System.out.println(noI);

        for(int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        figures.set(3, "Треугольник");

        System.out.println("");

        for(String s : figures) {
            System.out.println(s + " ");
        }
    }
}
