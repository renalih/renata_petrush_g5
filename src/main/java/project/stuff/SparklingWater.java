package main.java.project.stuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SparklingWater extends Water {

    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell, int temperature, boolean isOpened) {
        super(color, transparency, smell, temperature);
        this.bubbles = new Bubble[10000];
        this.isOpened = isOpened;
    }

/*    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }*/

    private void isOpened(boolean status) throws InterruptedException {
        Thread.sleep(2000);
        if (isOpened) {
            degas();
        }
    }

    public void degas() throws InterruptedException {

        Thread.sleep(1000);
        List<Bubble> list = new ArrayList<>(10 + 5 * getTemperature());

        for (int i = 0; i < list.size(); i++) {
            list.add(new Bubble("CO2"));
        }

        for (Bubble b : list) {
            b.cramp();
        }
    }

        public void setOpen(boolean isOpened) {
            this.isOpened = isOpened;
        }


    @Override
    public void setOpened() {

    }
}
