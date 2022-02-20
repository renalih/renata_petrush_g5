package bubbles;

public class Bubble {

    private double volume = 0.3; //mm3
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

    public double getVolume() {
        return volume;
    }

    public void burst(){
        System.out.println("Cramp!");
    }


}
