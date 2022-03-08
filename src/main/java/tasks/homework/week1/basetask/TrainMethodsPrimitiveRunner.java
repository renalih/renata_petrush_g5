package tasks.homework.week1.basetask;

public class TrainMethodsPrimitiveRunner {

    public static void main(String[] args) {

        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();

        trainMethodsPrimitive.printInt(7);
        trainMethodsPrimitive.printLong(100000000);
        trainMethodsPrimitive.printChar('$');
        trainMethodsPrimitive.printFloat(0.5F);
        trainMethodsPrimitive.printDouble(123456789.987654321);
        trainMethodsPrimitive.printShort((short) 4);
        trainMethodsPrimitive.printByte((byte) 5);
        trainMethodsPrimitive.printBoolean(true);

    }
}
