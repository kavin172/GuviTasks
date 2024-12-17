package com.guvi.employee_management_system.service;

import com.guvi.employee_management_system.model.Employee;
import com.guvi.employee_management_system.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(String employeeId) {
        return repository.findByEmployeeId(employeeId);
    }
}
