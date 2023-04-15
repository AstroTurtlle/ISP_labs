package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private List<Student> studentList = new ArrayList<>();
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void removeStudent(int index) {
        studentList.remove(index);
    }
    public void updateStudent(int id, String name, String subject, int grade) {
        for (Student student : studentList) {
            if (student.getID() == id) {
                student.setName(name);
                student.setGrade(subject, grade);
                break;
            }
        }
    }
    public double averageGrade(int id) {
        double average = 0;
        for (Student student : studentList) {
            if (student.getID() == id) {
                for(int grade : student.getGrades().values()) {
                    average += grade;
                }
                return average/student.getGrades().size();
            }
        }
        return 0;
    }
    public String displayList() {
        String students = "";
        for(Student student : studentList) {
            students+= student.toString() + "\n";
        }
        return students;
    }
}
