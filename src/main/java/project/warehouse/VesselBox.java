package main.java.project.warehouse;

import main.java.project.stuff.Transformable;
import main.java.project.vessel.Containable;

import java.util.List;
import java.util.Objects;

public class VesselBox implements Containable {

    private String name;
    private int capacity;
    private List<Containable> box;
    private long id;

    public VesselBox(String name, List<Containable> box, long id) {
        this.name = name;
        this.box = box;
        this.id = getId();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox vesselBox = (VesselBox) o;
        return capacity == vesselBox.capacity && id == vesselBox.id && Objects.equals(name, vesselBox.name) && Objects.equals(box, vesselBox.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, box, id);
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
