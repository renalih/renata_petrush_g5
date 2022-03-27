package main.java.tasks.classwork.day13;

public class ThreadOrderTask {

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("t1-%s ", i);
            }
        }).start(); //для начала старта 100 милисек надо, поэтому из мейн стартует первым

        for (int i = 0; i < 3; i++) {
            Thread.currentThread().sleep(1000);
            System.out.printf("m-%s ", i);
        }
    }
}
