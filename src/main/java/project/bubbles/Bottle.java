package main.java.tasks.project.bubbles;

public class Bottle extends Water{

    private int volume;

    public Bottle(String color, int transparency, String smell, int temperature, int volume) {
        super(color, transparency, smell, temperature);
        this.volume = volume;
    }



/*    public void open() {

        SparklingWater sparklingWater = new SparklingWater();

        sparklingWater.degas();
    }*/
}
