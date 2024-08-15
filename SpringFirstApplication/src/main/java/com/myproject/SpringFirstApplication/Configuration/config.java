package com.myproject.SpringFirstApplication.Configuration;

import com.myproject.SpringFirstApplication.Repository.DepartmentRepository;
import com.myproject.SpringFirstApplication.Repository.EmployeeRepository;
import com.myproject.SpringFirstApplication.Repository.ProjectRepository;
import com.myproject.SpringFirstApplication.Repository.RoleRepository;
import com.myproject.SpringFirstApplication.Service.*;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class config {

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository, ModelMapper mapper, AddressService addressService) {
        return new EmployeeService(employeeRepository, mapper,addressService);
    }

    @Bean
    public DepartmentService departmentService(DepartmentRepository departmentRepository, ModelMapper mapper){
        return new DepartmentService(departmentRepository,mapper);
    }

    @Bean
    public RoleService roleService(RoleRepository roleRepository, ModelMapper mapper){
        return new RoleService(roleRepository,mapper);
    }

    @Bean
    public ProjectService projectService(ProjectRepository projectRepository, ModelMapper mapper){
        return  new ProjectService(projectRepository,mapper);
    }

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
