package main.java.tasks.classwork.day13;

public class Blocks {

    /*static {
        method(); //блок кода нужен, если надо, чтобы автоматом отработали некоторые методы при создании объекта
    }*/

/*    public static void method() {
        System.out.println("I am public static void method");
    }*/

    int x;
    static int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        Blocks.y = y;


    }
}
