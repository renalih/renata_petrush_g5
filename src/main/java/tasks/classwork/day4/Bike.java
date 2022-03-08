package tasks.classwork.day4;

public class Bike extends Vehicle implements Movable{

    public Bike(int speed, String color, String model, Wheel[] wheels) {
        super(speed, color, model, wheels);
    }


    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");

    }
}
