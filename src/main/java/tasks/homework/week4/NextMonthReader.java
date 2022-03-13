package tasks.homework.week4;

import java.util.Scanner;

public class NextMonthReader {

    public static void main(String[] args) {

        System.out.println("Enter number of current month: ");

        Scanner scanner = new Scanner(System.in);
        int incoming = scanner.nextInt();
        System.out.println(monthDefinition(incoming));
    }

    public static String monthDefinition(int incoming) {
        String[] month = {"","January", "February","March","April","May","June","July","August",
                "September","October","November","December"};
        if (incoming > 0 && incoming < month.length) {
            return month[incoming + 1];
        }
        return "Such month does not exist";
    }

}
