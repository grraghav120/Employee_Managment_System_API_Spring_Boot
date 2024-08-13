package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.EmployeeDTO;
import com.myproject.SpringFirstApplication.Entity.Employee;
import com.myproject.SpringFirstApplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService implements IEmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO Get(int id) {
        Employee employee=employeeRepository.findById(id).orElse(null);
        return new EmployeeDTO(employee.getId(),employee.getName(),employee.getSalary());
    }

    @Override
    public void Create(EmployeeDTO employee) {
        Employee insertedEmployee=new Employee(employee.getId(),employee.getName(),employee.getSalary());
        employeeRepository.save(insertedEmployee);
    }

    @Override
    public List<EmployeeDTO> GetAll() {
        List<Employee> employee = employeeRepository.findAll();
        List<EmployeeDTO> employees = new java.util.ArrayList<>(List.of());
        for(Employee emp:employee){
            employees.add(new EmployeeDTO(emp.getId(),emp.getName(),emp.getSalary()));
        }
        return employees;
    }

    @Override
    public void Delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDTO Update(EmployeeDTO employee,int id) {
        Employee savedEmployee=employeeRepository.findById(id).orElse(null);
        if(savedEmployee!=null){
            savedEmployee.setName(employee.getName());
            savedEmployee.setSalary(employee.getSalary());
            Employee emp=employeeRepository.save(savedEmployee);
            return new EmployeeDTO(emp.getId(),emp.getName(),emp.getSalary());
        }else return null;
    }
}
