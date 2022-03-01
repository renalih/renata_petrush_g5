package main.java.tasks.classwork.day4;

public class Wheel {

    private int diameter;
    private String type;

    public Wheel(int diameter, String type) {
        this.diameter = diameter;
        this.type = type;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", type='" + type + '\'' +
                '}';
    }
}
