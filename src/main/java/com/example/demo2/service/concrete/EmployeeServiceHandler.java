package com.example.demo2.service.concrete;

import com.example.demo2.model.response.EmployeeResponse;
import com.example.demo2.service.abstraction.EmployeeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("default")
public class EmployeeServiceHandler implements EmployeeService {
    @Override
    public EmployeeResponse  getEmployee() {
        return new EmployeeResponse("Default profile");
    }
}
