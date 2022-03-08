package project.bubbles;

public class Bottle extends Water{

    private double volume;


    public Bottle(String color, int transparency, String smell, int temperature, double volume) {
        super(color, transparency, smell, temperature);
        this.volume = volume;
    }

    public void open() {
        SparklingWater sparklingWater = new SparklingWater(
                getColor(), getTransparency(), getSmell(), getTemperature());
        sparklingWater.degas();

    }
}
