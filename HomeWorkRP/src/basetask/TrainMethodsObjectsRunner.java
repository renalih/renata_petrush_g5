package basetask;
public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse(new Mouse("Джессика", 30));
        trainMethodsObjects.processSouce(new Souce("дзадзики", "белый"));
        trainMethodsObjects.processBee(new Bee("женский", 15));
        trainMethodsObjects.processObstacle(new Obstacle("мышь украла соус", "серьезное"));
        trainMethodsObjects.processPineapple(new Pineapple("саперави", 1234.5678));


    }
}
