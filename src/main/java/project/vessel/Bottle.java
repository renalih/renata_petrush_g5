package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.Water;

public class Bottle extends Vessel implements Containable {

    private Transformable stuff;

    public Bottle(double volume, double weight, Material material) {
        super(volume, 2.0, weight, material);
    }

    @Override
    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
    }

    @Override
    public Transformable removeStuff() {
        return stuff = null;
    }

    @Override
    public boolean isEmpty() {
        return stuff == null;
    }

    public void open() {
        this.stuff.setOpened();
    }

    public void warm(int temperature) {
        stuff.setTemperature(temperature);
    }

}
