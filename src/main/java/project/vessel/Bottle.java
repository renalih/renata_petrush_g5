package main.java.project.vessel;

import project.bubbles.SparklingWater;

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
        //this.water.setTemperature(temperature);
    }

    public SparklingWater getWater() {
        this.water = water;
        return water;
    }

    public void setWater(SparklingWater water) {
      this.water = water; //в конструкторе
    }
}
