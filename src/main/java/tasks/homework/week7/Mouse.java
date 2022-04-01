package main.java.tasks.homework.week7;

public class Mouse {

    private String pattern = "Mouse <n>";
    private String name;

    public Mouse(int number) {
        this.name = "Mouse <" + number + ">";
    }

    public void peep() throws InterruptedException {
        System.out.println(name + " PEEP!");
        Thread.sleep(200);
    }
}
