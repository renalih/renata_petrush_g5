package main.java.tasks.homework.week7;

public class Hedgehog {

    private String pattern = "Hedgehog <n>";
    private String name;

    public Hedgehog (int number) {
        this.name = "Hedgehog <" + number + ">";
    }

    public void tellMe() throws InterruptedException {
        System.out.println("I am " + name);
        Thread.sleep(50);
    }
}
