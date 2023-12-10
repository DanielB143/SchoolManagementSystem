package org.Dan.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Department {
    public static int nextId = 0;
    private String id;
    private String departmentName;

    public Department(String departmentName) {
        this.id = String.format("D%03d", ++nextId);
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
