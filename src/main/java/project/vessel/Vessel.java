package main.java.project.vessel;

import main.java.project.material.Material;

public abstract class Vessel {

    private double volume;
    private double diameter;
    private double weight;
    private Material material;

    public Vessel(double volume, double diameter, double weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = material.getDensity() * volume / 4 ;
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
