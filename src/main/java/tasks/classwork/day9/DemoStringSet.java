package tasks.classwork.day9;

import java.util.*;

public class DemoStringSet {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        long t0 = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++) {
            myList1.add("a");
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for(int i = 0; i < 1000000; i++) {
            myList2.add("a");
        }

        System.out.println(System.currentTimeMillis() - t0);

    }
}
