package project.bubbles;

public class Runner {

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle("white", 85, "sweet", 21, 0.5);
        Bottle bottle2 = new Bottle("orange", 50, "sweet", 18, 1);
        Bottle bottle3 = new Bottle("braun", 35, "sweet", 25, 1.5);

        bottle1.open();
        bottle2.open();
        bottle3.open();


    }

}

