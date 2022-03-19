package main.java.tasks.classwork.day10;

public class Runner {
    public static void main(String[] args) {

        MyClass mc = new MyClass();
        //mc.justMethod(x -> System.out.println("bogaga"));
        //mc.justMethod(x -> System.out::println);
        mc.justMethod(ClassX::new); // вариант записи с лямбда: (x -> new ClassX(x))

    }
}
