package project.bubbles;

public class SparklingWater extends Water{

    private Bubble[] bubbles;

    public SparklingWater(String color, int transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
        this.bubbles = bubbles;
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }


    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }


    public void degas() {
        Bubble burs = new Bubble();

        for (Bubble bubble : bubbles) {
            burs.burst();

        }

    }

}
