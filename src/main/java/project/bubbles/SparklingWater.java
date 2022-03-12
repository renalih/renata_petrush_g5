package project.bubbles;

public class SparklingWater extends Water{

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell, int temperature, boolean isOpened) {
        super(color, transparency, smell, temperature);
        this.isOpened = isOpened;
    }


    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    private void isOpened(boolean status) {
        if (isOpened) {
            degas();
        }
    }

    public void degas() {
        Bubble burs = new Bubble("CO2");

        for (Bubble bubble : bubbles) {
            burs.cramp();

        }

    }

}
