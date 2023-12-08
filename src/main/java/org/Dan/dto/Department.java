package org.Dan.dto;

public class Department {
    private static int nextId = 0;
    private String id = String.format("D%03d", ++nextId);
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        if (nextId <= 5) {
            return "Add department Department(" +
                    "id='" + id + '\'' +
                    ", departmentName='" + departmentName + '\'' +
                    ')' + " successfully.";
        } else{
            return String.format("Max department reached, add a new department failed.");
        }
    }
}
