package cycletask;

import java.util.Arrays;
import java.util.Random;

public class CycleArray {

    int[] array = new int[7];
    Random random = new Random();

    public void setArray() {
        for (int i = 0; i < 7; i++) {
            array[i] = random.nextInt(100);
        }

    }

    public void printArray() {

        System.out.println("Элементы массива: ");

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println('\n');
    }

    public void printArrayVersa() {
       System.out.println("Массив в обратном порядке: ");

        for (int i = 0; i < array.length / 2; i++) {
            int reverse = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = reverse;
        }

        for (int i : array ) {
            System.out.println(i);
        }
        System.out.println('\n');
    }

    public void printArrayMulti() {

        System.out.println("Умноженные элементы массива: ");

        for (int i : array) {

            System.out.println(i * 5);
        }
        System.out.println('\n');
    }

    public void printArraySquare() {

        System.out.println("Элементы массива в квадрате: ");

        for (int i : array) {

            System.out.println(i * i);
        }
        System.out.println('\n');
    }

    public void printArrayMin() {

        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Минимальный элемент массива: " + minValue);
        System.out.println('\n');

    }

    public void arrayChangeFirstLastInt() {

        System.out.println("Замена мест между первым и последними элементами:");

        int changer = array[0];

        array[0] = array[array.length - 1];
        array[array.length - 1] = changer;
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println('\n');
    }

    public void arraySort(){

        System.out.println("Сортировка элементов по убыванию:");

        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int reverse = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = reverse;
        }

        for (int i : array) {
            System.out.println(i);
        }

    }

}