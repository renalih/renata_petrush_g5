package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();

        String str = "мама мыла раму мыла";
        String[] words = str.split(" ");


        for (String i : words) {
            mylist.add(i);
        }

        System.out.println("Список по индексу: ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }


        System.out.println("Список for-each: ");

        for (String i : mylist) {
            System.out.println(i);
        }
    }
}
