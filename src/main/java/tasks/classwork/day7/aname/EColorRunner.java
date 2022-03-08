package tasks.classwork.day7.aname;

import java.util.Locale;

import static tasks.classwork.day7.aname.ConstantContainer.RED;

public class EColorRunner {

    public static void main(String[] args) {

        isColor("red");

    }

    private static void isColor(String color) {
        String aColor = color;
        switch (EColor.valueOf(color.toUpperCase(Locale.ROOT))) {
            case RED:
                System.out.println(EColor.RED.name + EColor.RED.hex);
                break;
            case BLUE:
                System.out.println(EColor.BLUE.name + EColor.BLUE.hex);
                break;
            case GREEN:
                System.out.println(EColor.GREEN.name + EColor.GREEN.hex);
                break;
 /*           case ConstantContainer.YELLOW:
                System.out.println(ConstantContainer.YELLOW);
                break;
            case ConstantContainer.PURPLE:
                System.out.println(ConstantContainer.PURPLE);
                break;*/
            default:
                System.out.println("NO COLOR");
        }
    }
}
