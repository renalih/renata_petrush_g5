package tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class DemoNames {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for(String s : names) {
            System.out.print(s + " ");
        }

        System.out.println('\n');

        names.set(2, "Оля");
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        names.remove("Оля");
        names.remove(3);

        for(String name : names) {
            System.out.println(name + " ");
        }
    }
}
