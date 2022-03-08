package tasks.classwork.day2;

public class AppleRunner {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Apple apple2 = new Apple( "blue",  "sour",  20, 12);

        apple.setColor("red");
        apple.setTaste("sweet");
        apple.setWeight(50);

        System.out.println(apple.toString());
        System.out.println(apple2.toString());

        System.out.println("Apple color: " + apple2.getColor());

    }
}
