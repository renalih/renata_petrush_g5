package main.java.tasks.classwork.day7;

public class GenericContainer <T> {

    private T[] container;
    private int currentPlace;

    public GenericContainer() {
        container = (T[]) new Object[10];
        currentPlace = 0;
    }


    public void add (T o) {

        if (currentPlace < 10) {
            container[currentPlace++] = o;
        }
    }


    public T removeLast () {
        T result = null;
        if (currentPlace > 0) {
            result = container[currentPlace - 1];
            container[--currentPlace] = null;
            }
            return result;
    }

    public boolean isEmpty () {
        return currentPlace == 0;
    }


}
