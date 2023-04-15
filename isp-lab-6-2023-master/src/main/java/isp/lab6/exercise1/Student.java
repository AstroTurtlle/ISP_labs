package isp.lab6.exercise1;

import java.util.HashMap;

public class Student {
    private int ID;
    private String name;
    private HashMap<String, Integer> grades = new HashMap<>();

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public void setGrade(String subject, int new_grade) {
        grades.replace(subject, new_grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
