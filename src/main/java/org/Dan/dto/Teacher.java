package org.Dan.dto;

public class Teacher {
    private static int nextId = 0;
    private String fname;
    private String lname;
    private Department department;
    private String id = String.format("T%03d", ++nextId);

    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
