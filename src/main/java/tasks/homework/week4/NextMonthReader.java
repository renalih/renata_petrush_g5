package tasks.homework.week4;

import java.time.Month;
import java.util.Scanner;

public class NextMonthReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца: ");

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            Month month = Month.of();
            System.out.println(month);
        }


    }


}
