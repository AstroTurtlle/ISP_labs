package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        GradeManager grademanager = new GradeManager();
        System.out.println(grademanager.displayList());
        Student student1 = new Student(1, "Radu");
        Student student2 = new Student(2, "Mircea");
        Student student3 = new Student(3, "Tudor");

        grademanager.addStudent(student1);
        grademanager.addStudent(student2);
        grademanager.addStudent(student3);
        System.out.println(grademanager.displayList());

        student1.addGrade("ISP", 10);
        student2.addGrade("ISP", 9);
        student3.addGrade("ISP", 5);
        System.out.println(grademanager.displayList());

        grademanager.removeStudent(1);
        System.out.println(grademanager.displayList());

        grademanager.updateStudent(3, "Andrei", "ISP", 6);
        System.out.println(grademanager.displayList());

        student1.addGrade("PA", 8);
        student1.addGrade("MP", 4);
        student1.addGrade("TS", 5);
        System.out.println(grademanager.displayList());
        System.out.println("Average grade is: " + grademanager.averageGrade(1));
    }
}
