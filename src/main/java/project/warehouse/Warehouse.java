package main.java.project.warehouse;

import java.util.Map;

public class Warehouse {

    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) {
        stock.put(1, box);
    }

    private VesselBox getBox(){
        return getBox();
    }

    private void removeBox() {
        stock.remove(getBox());

    }

}
