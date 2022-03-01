package main.java.tasks.homework.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {


        CycleWhile cycleWhile = new CycleWhile();
        CycleFor cycleFor = new CycleFor();
        CycleArray cycleArray = new CycleArray();

        cycleWhile.processWhile();
        cycleFor.processFor();
        cycleArray.setArray();
        cycleArray.printArray();
        cycleArray.printArrayVersa();
        cycleArray.printArrayMulti();
        cycleArray.printArraySquare();
        cycleArray.printArrayMin();
        cycleArray.arrayChangeFirstLastInt();
        cycleArray.arraySort();

    }


}

