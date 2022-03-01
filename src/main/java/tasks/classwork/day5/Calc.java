package main.java.tasks.classwork.day5;

public class Calc {

    public int calculate(String action, int x, int y){
        switch (action){
            case "+":
                return add(x, y);
            case "-":
                return subtract(x, y);
            case "*":
                return multiply(x, y);
            case "/":
                return divide(x,y);
            default:
                return 0;
        }

    }

    public int add (int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y ;
    }
    public int divide(int x, int y) {
        return x / y;
    }




}
