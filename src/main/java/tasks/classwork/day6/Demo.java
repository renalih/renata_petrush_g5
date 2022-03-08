package tasks.classwork.day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo {

    public static void main(String[] args) throws ParseException {

   /*     String x = "sdf@mail.ru";

       // String[] y = x.split("\\d+"); //доходит до цифры и обрезает
        //String[] y = x.split("a{2}+");
        //x = x.replaceAll("abc", "777");
        //x = x.substring(1);
        //x = x.trim();

        x = x + "s";

        StringBuilder sb = new StringBuilder();

        for (int d = 0; d < 1000000; d++) {
            sb.append("dflpgl30");
        }
        System.out.println(sb);

        System.out.println(x);
        boolean z = x.matches("[a-z]+@[a-z]+.[a-z]{2}");

        System.out.println(z);


        //System.out.println(x.contains("234"));
*//*
       // for (String z : y) {
            System.out.println(z);
        }*//*

*//*        System.out.println(x.equals("Abc"));
        System.out.println(x.equalsIgnoreCase("Abc"));*//*
*/
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        Date date = dateFormat.parse("04.06.2012");

        String text = dateFormat.format(new Date());

        System.out.println(text);



    }
}
