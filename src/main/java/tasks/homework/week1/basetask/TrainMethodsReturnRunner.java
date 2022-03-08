package tasks.homework.week1.basetask;

import javax.sound.midi.Soundbank;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(254));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(123456789));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('#'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(6.8F));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(123456789.987654321));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short)8));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte)45));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(false));

    }
}
