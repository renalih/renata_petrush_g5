package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;

public class Bottle extends Vessel implements Containable {

    private SparklingWater water;
    private Transformable stuff;

    public Bottle(double volume, double diameter, double weight, Material material,
                  SparklingWater water, Transformable stuff) {
        super(volume, diameter = 2.0, weight, material);
        this.water = water;
        this.stuff = stuff;
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void open() {
        this.water.setOpened();
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
