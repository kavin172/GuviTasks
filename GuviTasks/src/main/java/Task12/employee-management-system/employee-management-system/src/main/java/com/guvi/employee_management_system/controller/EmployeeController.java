package com.guvi.employee_management_system.controller;

import com.guvi.employee_management_system.model.Employee;
import com.guvi.employee_management_system.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/displayAll")
    public String displayAllEmployees(Model model) {
        List<Employee> employees = service.getAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping("/display/{employeeId}")
    @ResponseBody
    public Employee displayEmployeeById(@PathVariable String employeeId) {
        return service.getEmployeeById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

}
