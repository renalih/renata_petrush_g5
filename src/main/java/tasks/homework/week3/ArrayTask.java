package tasks.homework.week3;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.Random;

public class ArrayTask {

    int[] array = new int[10];
    Random random = new Random();


    public void setArray() {
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Рандомный  массив: " + Arrays.toString(array));
    }


    public void sumElementsFromArray (int n) {
        //int [] array = {5, 3, 12, 7, 2, 10, 15, 4, 8, 11};
        int sum = 0;
        for (int i = n - 1; i < array.length; i += n) {
            sum += array[i];
        }
        System.out.println("Сумма каждого " + n + "-ого элемента в целочисленном массиве: " + sum);
    }


    public void returnArray (int n) {
        int [] arrayNew = new int[array.length];
        for (int i = 0; i < arrayNew.length; i++) {
            if (n < array[i]) {
                arrayNew[i] = array[i];
            }
        }

        for (int i = 0; i < arrayNew.length / 2; i++) {
            int reverse = arrayNew[i];
            arrayNew[i] = arrayNew[arrayNew.length - 1 - i];
            arrayNew[arrayNew.length - 1 - i] = reverse;
        }

        System.out.println("Новый массив в обратном порядке: " + Arrays.toString(arrayNew));

    }


    public void returnArrayByMonth() {
        int month = YearMonth.now().getMonthValue();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % month == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов массива, которые кратны числу текущего месяца: " + sum);
    }


    public void printPicture() {
        System.out.println("\t  ^__^\n" +
                "\t  (oo)\\\\_______\n" +
                "\t (__)\\ ) \\/\\  \\\n" +
                "\t      ||----w |\\\n" +
                "\t      ||     ||");
    }

}
