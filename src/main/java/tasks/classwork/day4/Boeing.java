package main.java.tasks.classwork.day4;

public class Boeing extends Plane implements Movable{

    public Boeing(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Boeing has started");

    }

    @Override
    public void stop() {
        System.out.println("Boeing has stopped");

    }
}
