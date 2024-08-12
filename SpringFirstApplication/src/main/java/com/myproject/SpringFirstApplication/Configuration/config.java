package com.myproject.SpringFirstApplication.Configuration;

import com.myproject.SpringFirstApplication.Service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public EmployeeService employeeService(){
        return new EmployeeService();
    }
}
