package tasks.classwork.day4;

public abstract class Vehicle extends Machinary {

    protected int speed;
    protected String color;
    protected String model;
    protected Wheel[] wheels;

    public Vehicle(int speed, String color, String model, Wheel[] wheels) {
        super("Vehicle");
        this.speed = speed;
        this.color = color;
        this.model = model;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
