package main.java.tasks.homework.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));

        for(int i : numbers) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Сумма всех чисел списка: " + sum);

        Collections.sort(numbers);

        System.out.println("Список чисел по возрастанию: ");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("\n" + "Список чисел по убыванию: ");
        for(int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
