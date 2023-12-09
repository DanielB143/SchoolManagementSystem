package org.Dan;

import org.Dan.dto.Course;
import org.Dan.dto.Department;
import org.Dan.dto.Student;
import org.Dan.dto.Teacher;

public class Main {
    public static void main(String[] args) {

        Department[] departments = new Department[5];
        Student[] students = new Student[200];
        Teacher[] teachers = new Teacher[20];
        Course[] courses = new Course[30];

        departments[0] = new Department("Gorilla");
        Student s1 = new Student("Mike", "Lavzowski", departments[0]);
        System.out.println(s1);
    }
}
