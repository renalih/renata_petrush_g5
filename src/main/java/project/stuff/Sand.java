package main.java.project.stuff;

public class Sand implements Transformable{
    @Override
    public void setOpened() {
        System.out.println("Песок находится в открытом состоянии");
    }

    @Override
    public void setTemperature(int temperature) {

    }
}
