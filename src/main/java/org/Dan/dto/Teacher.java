package org.Dan.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher {
    public static int nextId = 0;
    private String fname;
    private String lname;
    private Department department;
    private String id;

    public Teacher(String fname, String lname, Department department) {
        this.id = String.format("T%03d", ++nextId);
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department.getDepartmentName() +
                '}';
    }
}
