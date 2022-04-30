package main.java.project.stuff;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SparklingWater extends Water {

    private List<Bubble> bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String transparency, String smell,
                          int temperature, boolean isOpened) throws InterruptedException {
        super(color, transparency, smell, temperature);
        bubbles = IntStream.rangeClosed(1, 10000).boxed().map(x -> new Bubble("CO2")).collect(Collectors.toList());
        isOpened();
    }

    private void isOpened() throws InterruptedException {
        Thread.sleep(2000);
        if (isOpened) {
            for (int i = 0; i < bubbles.size(); i++) {
                degas();
            }
        }
    }

    public void degas() throws InterruptedException { //переписать! создаются новые пузырьки
        Thread.sleep(1000);

/*        List<Bubble> freebubbles = new ArrayList<>(10 + 5 * getTemperature());

        for (int i = 0; i < freebubbles.size(); i++) {
            freebubbles.add(new Bubble("CO2"));
        }

        for (Bubble b : freebubbles) {
            b.cramp();
        }*/
    }

    public boolean setOpen() {
        return isOpened = true;
    }

}
