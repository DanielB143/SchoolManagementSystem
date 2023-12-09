package org.Dan.dto;

import java.util.Arrays;

public class Student {
    private static int nextId = 0;
    private String id = String.format("S%03d", ++nextId);
    private String fname;
    private String lname;
    private Department department;
    private Course[] courses;
    private int courseNum = courses.length;

    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
