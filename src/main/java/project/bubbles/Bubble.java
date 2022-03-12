package project.bubbles;

public class Bubble {

    private static final double VOLUME = 0.3;
    private String gas;


    public Bubble(String gas) {
        this.gas = gas;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }


    public void cramp(){
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return VOLUME;
    }


}
