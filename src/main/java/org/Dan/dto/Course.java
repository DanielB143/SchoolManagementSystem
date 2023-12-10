package org.Dan.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
public class Course {
    public static int nextId = 0;
    private double credit;
    private String id;
    private Student[] students = new Student[5];
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", ++nextId);
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }

    @Override
    public String toString() {
        String studentList = "";
        studentNum = 0;
        for (Student s : students) {
            if (s != null) {
                studentList += s.getFname() + " " + s.getLname() + ", ";
                studentNum++;
            }
        }

        if(teacher == null){
           return  "Course{" +
                    "id='" + id + '\'' +
                    ", courseName='" + courseName + '\'' +
                    ", credit=" + credit +
                    ", teacher=" + teacher +
                    ", department=" + department.getDepartmentName() +
                    ", students=[" + studentList + ']' +
                    '}';
        }
        return "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", teacher=" + teacher.getFname() + " " + teacher.getLname() +
                ", department=" + department.getDepartmentName() +
                ", students=[" + studentList + ']' +
                '}';
    }
}
