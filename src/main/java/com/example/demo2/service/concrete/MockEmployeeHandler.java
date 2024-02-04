package com.example.demo2.service.concrete;

import com.example.demo2.model.response.EmployeeResponse;
import com.example.demo2.service.abstraction.EmployeeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!default")
public class MockEmployeeHandler implements EmployeeService {
    @Override
    public EmployeeResponse getEmployee() {
        return new EmployeeResponse("Dev profile");
    }
}
