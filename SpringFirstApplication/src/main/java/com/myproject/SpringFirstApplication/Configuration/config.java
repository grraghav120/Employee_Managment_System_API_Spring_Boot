package com.myproject.SpringFirstApplication.Configuration;

import com.myproject.SpringFirstApplication.Repository.EmployeeRepository;
import com.myproject.SpringFirstApplication.Service.AddressService;
import com.myproject.SpringFirstApplication.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository, ModelMapper mapper, AddressService addressService) {
        return new EmployeeService(employeeRepository, mapper,addressService);
    }

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
