package org.Dan;

import org.Dan.dto.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sM1 = new SchoolManagementSystem("Vanier");

        sM1.addDepartment("CS");
        sM1.printDepartments();
        System.out.println(sM1.findDepartment("D001"));

        sM1.addStudent("Daniel", "Braguta", "D001");
        sM1.printStudents();
        System.out.println(sM1.findStudent("S001"));

        sM1.addTeacher("Yi", "Wang", "D001");
        sM1.printTeachers();
        System.out.println(sM1.findTeacher("T001"));

        sM1.addCourse("Prog", 3.0, "D001");
        sM1.printCourses();
        System.out.println(sM1.findCourse("C001"));

        sM1.addTeacher("Mom", "Vok", "D001");
        sM1.modifyCourseTeacher("T002", "C001");

        sM1.registerCourse("S001", "C001");
    }
}
