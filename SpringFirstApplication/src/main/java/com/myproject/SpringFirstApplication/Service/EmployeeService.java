package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.Entity.Employee;
import com.myproject.SpringFirstApplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService implements IEmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee Get(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void Create(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> GetAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void Delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee Update(Employee employee,int id) {
        Employee savedEmployee=employeeRepository.findById(id).orElse(null);
        if(savedEmployee!=null){
            savedEmployee.setName(employee.getName());
            savedEmployee.setSalary(employee.getSalary());
            return employeeRepository.save(savedEmployee);
        }else return null;
    }
}
