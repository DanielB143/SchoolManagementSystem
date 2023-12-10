package org.Dan.dto;


public class SchoolManagementSystem {

    Department[] departments = new Department[5];
    Student[] students = new Student[200];
    Teacher[] teachers = new Teacher[20];
    Course[] courses = new Course[30];
    private String name;

    public SchoolManagementSystem(String name) {
        this.name = name;
    }

    public void addDepartment(String departName) {
        int counter = Department.nextId;

        if (counter < 5) {
            departments[counter] = new Department(departName);
            System.out.println("Add department " + departments[counter] + " successfully.");
        } else {
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    public void printDepartments() {
        System.out.println("Teh departments are: ");
        for (Department d : departments) {
            if (d != null) {
                System.out.println(d);
            }
        }
    }

    public Department findDepartment(String id) {
        for (Department d : departments) {
            if (id.equals(d.getId())) {
                return d;
            }
        }
        return null;
    }

    public void addStudent(String fName, String lName, String departId) {
        int counter = Student.nextId;

        if (counter < 200) {
            students[counter] = new Student(fName, lName, findDepartment(departId));
            System.out.println("Add student " + students[counter] + " successfully.");
        } else {
            System.out.println("Max students reached, add a new student failed.");
        }
    }

    public void printStudents() {
        System.out.println("The students are: ");
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public Student findStudent(String studentId) {
        for (Student s : students) {
            if (studentId.equals(s.getId())) {
                return s;
            }
        }
        return null;
    }

    public void addTeacher(String fName, String lName, String departId) {
        int counter = Teacher.nextId;

        if (counter < 20) {
            teachers[counter] = new Teacher(fName, lName, findDepartment(departId));
            System.out.println("Add teacher " + teachers[counter] + " successfully.");
        } else {
            System.out.println("Max teachers reached, add a new teacher failed.");
        }
    }

    public void printTeachers() {
        System.out.println("The teachers are: ");
        for (Teacher t : teachers) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    public Teacher findTeacher(String teacherId) {
        for (Teacher t : teachers) {
            if (teacherId.equals(t.getId())) {
                return t;
            }
        }
        return null;
    }

    public void addCourse(String courseName, double credit, String departId) {
        int counter = Course.nextId;

        if (counter < 30) {
            courses[counter] = new Course(courseName, credit, findDepartment(departId));
            System.out.println("Add course " + courses[counter] + " successfully.");
        } else {
            System.out.println("Max courses reached, add a new course failed.");
        }
    }

    public void printCourses() {
        System.out.println("The courses are: ");
        for (Course c : courses) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    public Course findCourse(String courseId) {
        for (Course c : courses) {
            if (courseId.equals(c.getId())) {
                return c;
            }
        }
        return null;
    }

    public void modifyCourseTeacher(String teacherId, String courseId) {
        Course course = findCourse(courseId);
        Teacher teacher = findTeacher(teacherId);

        if(course != null){
            if(teacher != null){
                course.setTeacher(teacher);
                System.out.println(course + " teacher info updated successfully.");
            }else{
                System.out.println("Cannot find any teacher match with teacherId " + teacherId + ", modify " +
                       "teacher for course " + courseId + " failed.");
            }
        }else{
            System.out.println("Cannot find any course match with courseId" + courseId + ", modify " +
                       "teacher for course " + courseId + " failed.");
        }
    }

    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if(student != null){
            if(course != null){
                if(student.getCourseNum() < 5){
                    if(course.getStudentNum() < 5){
                        for(Student s : course.getStudents()) {
                            if(s == student){
                                System.out.println("Student " + studentId + " has already registered Course "
                                        + courseId + ", register course " + courseId + " for student "
                                        + studentId + " failed.");
                                break;
                            }else {
                                Student[] courseStudents = course.getStudents();
                                int registeredStudents = course.getStudentNum();
                                Course[] studentCourses = student.getCourses();
                                int registeredCourses = student.getCourseNum();

                                courseStudents[registeredStudents] = student;
                                course.setStudents(courseStudents);

                                studentCourses[registeredCourses] = course;
                                student.setCourses(studentCourses);

                                System.out.println("Latest student info:");
                                System.out.println(student);

                                System.out.println("Latest course info:");
                                System.out.println(course);

                                break;
                            }
                        }
                    }else{
                        System.out.println("Course " + courseId + " has been fully registered, register course "
                                        + courseId + " for student " + studentId + " failed.");
                    }
                }else{
                    System.out.println("Student " + studentId + " has already registered 5 courses, register " +
                                   "course for student " + studentId + " failed.");
                }
            }else{
                System.out.println("Cannot find any student match with courseId " + courseId + ", register " +
                              "course for student " + studentId + " failed.");
            }
        }else{
            System.out.println("Cannot find any student match with studentId " + studentId + ", register course for " +
                       "student " + studentId + " failed.");
        }
    }
}
