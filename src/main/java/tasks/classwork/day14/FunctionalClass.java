package main.java.tasks.classwork.day14;

public class FunctionalClass {

    public int generateNewInt(int initialInt) {

        int result = 0;
        if (initialInt < 30) {
            result = 4 + initialInt;
        } else {
            result = initialInt - 4;
        }

        System.out.println("The result is: " + result);
        return result;
    }
}
