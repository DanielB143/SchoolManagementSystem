package org.Dan.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
public class Student {
    public static int nextId = 0;
    private String id;
    private String fname;
    private String lname;
    private Department department;
    private Course[] courses = new Course[5];
    private int courseNum;

    public Student(String fname, String lname, Department department) {
        this.id = String.format("S%03d", ++nextId);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    @Override
    public String toString() {
        String courseList = "";
        courseNum = 0;
        for(Course c : courses){
            if(c != null){
                courseList += c + ", ";
                courseNum++;
            }
        }
        return "Student{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=[" + courseList +
                ']' + '}';
    }
}
