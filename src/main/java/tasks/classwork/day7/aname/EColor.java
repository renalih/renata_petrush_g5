package tasks.classwork.day7.aname;

public enum EColor {

    RED("red", 1),
    BLUE("blue", 2),
    GREEN("green", 3),
    YELLOW("yellow", 4),
    PURPLE("purple", 5);

    String name;
    int hex;

    EColor(String name, int hex) {
        this.name = name;
        this.hex = hex;
    }


}
