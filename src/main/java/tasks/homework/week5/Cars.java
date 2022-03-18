package main.java.tasks.homework.week5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Cars {

    public static void main(String[] args) throws IOException {

        Set<String> cars = new HashSet<String>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        BufferedWriter out = new BufferedWriter(new FileWriter("cars.txt"));
        for (String s : cars) {
            out.write('"' + s + '"' + "\n");
        }
        out.close();

        for(String s : cars) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    count++;
                }
            }
            if (count > 4) {  //ошибка при выполнении
                cars.remove(s);
            }
        }

        for(String s : cars) {
            System.out.print(s + " ");
        }
    }
}
