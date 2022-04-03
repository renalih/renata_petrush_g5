package main.java.tasks.classwork.day15.people;

public class ManualEngineer extends Engineer{

    public ManualEngineer(int age, int skill, int experience) {
        super(age, experience * 2, experience);
    }
}
