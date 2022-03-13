package project.boxing;

import project.bubbles.SparklingWater;
import project.bubbles.Water;

public class Bottle {

    private double volume;
    private SparklingWater water;

    public Bottle (double volume) {
        this.volume = volume;
    }

    public void open() {
        this.water.setOpened(true);
    }

    public void warm(int temperature) {
        this.water.setTemperature(temperature);
    }

    public SparklingWater getWater() {
        this.water = water;
        return water;
    }

    public void setWater(SparklingWater water) {
       this.water = new SparklingWater("a", "b", "c", 1, true);
    }
}
