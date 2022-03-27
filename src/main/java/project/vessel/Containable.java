package main.java.project.vessel;

import main.java.project.stuff.Transformable;

public interface Containable {

    default void addStuff(Transformable stuff) {
    };
    Transformable removeStuff();
    boolean isEmpty();
    void open();
    public void warm(int temperature);

}
