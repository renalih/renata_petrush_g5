package tasks.classwork.day2;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random ();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100); //медод для заполнения массива рандомными числами
        }

        int e = 0;

        for (int i : array) {
            System.out.println(i);
            e = i;
        }

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        System.out.println("Average value is: "  + sum / array.length);


    }
}

