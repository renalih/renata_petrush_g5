package tasks.classwork.day7.aname;

public class ConstantContainerRunner {

    private static void printColor(String color) {
        String aColor = color;
        switch (aColor) {
            case ConstantContainer.RED:
                System.out.println(ConstantContainer.RED);
                break;
            case ConstantContainer.BLUE:
                System.out.println(ConstantContainer.BLUE);
                break;
            case ConstantContainer.GREEN:
                System.out.println(ConstantContainer.GREEN);
                break;
            case ConstantContainer.YELLOW:
                System.out.println(ConstantContainer.YELLOW);
                break;
            case ConstantContainer.PURPLE:
                System.out.println(ConstantContainer.PURPLE);
                break;
            default:
                System.out.println("NO COLOR");
        }


    }

    public static void main(String[] args) {

    }
}
