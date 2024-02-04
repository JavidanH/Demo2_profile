package com.example.demo2.controller;


import com.example.demo2.model.response.EmployeeResponse;
import com.example.demo2.service.abstraction.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public EmployeeResponse getEmployee(){
        return  employeeService.getEmployee();
    }
}
