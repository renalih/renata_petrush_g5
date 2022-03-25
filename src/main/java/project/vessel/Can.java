package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    private Transformable stuff;


    public Can(double volume, double diameter, double weight, Material material, Transformable stuff) {
        super(volume, diameter = 10.0, weight, material);
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

    @Override
    public void open() {

    }

    @Override
    public void warm(int temperature) {

    }
}
