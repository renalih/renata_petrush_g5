package tasks.classwork.day8;

public class Demo {

    public static void main(String[] args) {

        String x = String.valueOf(123);
        x = String.join(":", "123", "abc");
        x = String.format("%s мама %s мыла %s", "раму", "чисто", "быстро"); //%s регулярка для стринг формата

        System.out.println(x);

        //System.out.printf("%s мама %s мыла %s", "раму", "чисто", "быстро"); //то же самое, что и String.format

    }
}
