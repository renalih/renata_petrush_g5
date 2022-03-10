package tasks.homework.week3;

import java.util.Arrays;

public class StringTask {

    public void duplicateWord(String str) {

        int count;

        str = str.toLowerCase();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0") {
                System.out.println("Дубликат в строке: " + words[i]);
            }
        }

    }


    public void extractNumbers (String str) {

        str = str.replaceAll("[^\\d]", " "); //замена нечисловых знаков на пробел

        str = str.trim();

        str = str.replaceAll(" +", " ");

        String[] stringArray = str.split(" ");
        int[] numbersArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            numbersArray[i] = Integer.parseInt(stringArray[i]);

        }

        System.out.println("Массив чисел из текста: " + Arrays.toString(numbersArray));

    }
}
