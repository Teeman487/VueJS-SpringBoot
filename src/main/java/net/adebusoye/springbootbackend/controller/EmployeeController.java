package net.adebusoye.springbootbackend.controller;

import net.adebusoye.springbootbackend.entity.Employee;
import net.adebusoye.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
   @GetMapping("/employees")
    public List<Employee> fetchEmployees(){
        return  employeeRepository.findAll();
    }
}
