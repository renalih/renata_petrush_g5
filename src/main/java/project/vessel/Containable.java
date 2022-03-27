package main.java.project.vessel;

import main.java.project.stuff.Transformable;

public interface Containable {

    void addStuff(Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();
    void open();
    void warm(int temperature);

}
