package main.java.tasks.classwork.day13;


public class Runner {

    public static void main(String[] args) throws InterruptedException {

        //Blocks.method();

/*        Blocks b1 = new Blocks();
        Blocks b2 = new Blocks();

        b1.setX(1);
        b1.setY(2);

        b2.setX(3);
        b2.setY(4);

        System.out.println(b1.getX());
        System.out.println(b1.getY());
        System.out.println(b2.getX());
        System.out.println(b2.getY());*/

        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s ", i);
                }
            }
        }).start();

        Thread.sleep(1000);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s ", i);
            }

        }
    }
}

