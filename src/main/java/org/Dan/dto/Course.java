package org.Dan.dto;

import java.util.Arrays;

public class Course {
    private static int nextId = 0;
    private double credit;
    private  String id = String.format("C%03d", ++nextId);
    private Student[] students;
    private Department department;
    private int studentNum = students.length;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + Arrays.toString(students) +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
