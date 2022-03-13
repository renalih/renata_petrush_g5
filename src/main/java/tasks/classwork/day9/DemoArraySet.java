package tasks.classwork.day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoArraySet {
    public static void main(String[] args) {

        Set<String> mylist = new HashSet<>();

        String str = "мама мыла раму мыла";
        String[] words = str.split(" ");


        for (String i : words) {
            mylist.add(i);
        }


        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(String i : mylist) {
            System.out.println(i);
        }

    }
}
