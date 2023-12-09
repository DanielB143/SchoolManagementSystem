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
            return "Department(" +
                    "id='" + id + '\'' +
                    ", departmentName='" + departmentName + '\'' +
                    ')';
    }
}
