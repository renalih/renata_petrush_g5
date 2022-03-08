package tasks.classwork.day7;

public class C extends A { //способ унаследования от класса

    public int foo(int x){
        int y = super.foo(x);
        System.out.println(y);
        return y;
    }
}
