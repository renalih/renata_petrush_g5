package bubbles;

public class SparklingWater extends Water{

    public SparklingWater(String color, int transparency, String smell, int temperature, Bubble bubble) {
        super(color, transparency, smell, temperature);
        this.bubble = bubble;
    }

    Bubble bubble = new Bubble("сероводородный");

    public void pump(Bubble[] bubbles) {

        int [] array = new int[10000];
    }

}
