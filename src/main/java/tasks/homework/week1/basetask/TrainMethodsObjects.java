package tasks.homework.week1.basetask;


public class TrainMethodsObjects {


    public void processMouse(Mouse mouse){

        mouse = new Mouse(mouse.getName(), mouse.getAge());

        System.out.println("Имя мыши: " + mouse.getName());
        System.out.println("Возвраст мыши: " + mouse.getAge());
        mouse.printMouseDetails();

    }


    public void processSouce(Souce souce){

        souce = new Souce(souce.getName(), souce.getColor());

        System.out.println("Имя соуса: " + souce.getName());
        System.out.println("Цвет соуса: " + souce.getColor());
        souce.printSouceDetails();

    }


    public void processBee(Bee bee){

        bee = new Bee(bee.getGender(), bee.getWeight());

        System.out.println("Пол пчелы: " + bee.getGender());
        System.out.println("Вес пчелы (г): " + bee.getWeight());
        bee.printBeeDetails(bee.getWeight());

    }


    public void processObstacle(Obstacle obstacle){

        obstacle = new Obstacle(obstacle.getDescription(), obstacle.getSeverity());

        System.out.println("Описание препятствия: " + obstacle.getDescription());
        System.out.println("Важность: " + obstacle.getSeverity());
        obstacle.printObstacleDetails();

    }

    public void processPineapple(Pineapple pineapple){

        pineapple = new Pineapple(pineapple.getGrade(),pineapple.getHeatCapacity());

        System.out.println("Сорт ананаса: " + pineapple.getGrade());
        System.out.println("Теплоёмкость ананаса: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails(pineapple.getHeatCapacity());

    }


}
