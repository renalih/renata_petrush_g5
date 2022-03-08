package main.java.tasks.homework.basetask;

public class Obstacle {

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    private String description;
    private String severity;


    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public void printObstacleDetails(){
        System.out.println("Возникло " + this.severity + " препятствиие " + this.description); //указываются просто поля или геттеры?
    }
}
