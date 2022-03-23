package main.java.project.runner;

import main.java.project.vessel.Bottle;

public class Runner {

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(  0.5);
        Bottle bottle2 = new Bottle( 1);
        Bottle bottle3 = new Bottle( 1.5);

        bottle1.open();
        bottle2.open();
        bottle3.open();


    }

}

