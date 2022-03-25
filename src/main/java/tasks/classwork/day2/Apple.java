package main.java.tasks.classwork.day2;

public class Apple extends Fruit {

    private String color;
    private String taste;
    private int weight;

    public Apple () {
        super(20, "Apple");
    }

    public Apple(String color, String taste, int weight, int sugar) {
        super(sugar, "Apple");
        this.color = color;
        this.taste = taste;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", weight=" + weight +
                ", name=" + super.getName() + '\'' +
                ", sugar=" + super.getSugar() +
                '}';
    }
}

