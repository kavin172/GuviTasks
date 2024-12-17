package com.guvi.employee_management_system.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employees")
public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String location;
}
