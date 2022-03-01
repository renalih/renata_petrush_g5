package main.java.tasks.classwork.day5;

public class CalcTest {

    public static void main(String[] args) {

        Calc calc = new Calc();

        doTest("addition", calc.calculate("+",2, 3), 5 );
        doTest("subtraction", calc.calculate("-",3, 1), 2 );
        doTest("multiplication", calc.calculate("*", 2, 3), 6 );
        doTest("division", calc.calculate("/", 6, 3), 2 );

    }

    private static void doTest(String testName, int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test " + testName + ": PASSED");
        } else {
            System.out.println("Test " + testName + ": FAILED");
        }
    }
}
