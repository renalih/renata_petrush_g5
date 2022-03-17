package tasks.homework.week5;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андорра");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String s : countries) {
            System.out.print(s + ", ");
        }



    }
}
