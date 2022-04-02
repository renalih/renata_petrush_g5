package main.java.tasks.classwork.day14;

import org.junit.Assert;
import org.junit.Test;

public class FunctionalClassTest {

    @Test
    public void generateNewIntTestLess30() {
        FunctionalClass fc = new FunctionalClass();
        int result = fc.generateNewInt(20);
        Assert.assertEquals("Generated int is not +4", 24, result);
    }

    @Test
    public void generateNewIntTestMore30() {
        FunctionalClass fc = new FunctionalClass();
        int result = fc.generateNewInt(40);
        Assert.assertEquals("Generated int is not -4", 36, result);
    }
}
