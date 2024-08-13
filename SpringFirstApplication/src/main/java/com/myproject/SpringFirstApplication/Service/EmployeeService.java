package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.EmployeeDTO;
import com.myproject.SpringFirstApplication.DTO.EmployeeResponse;
import com.myproject.SpringFirstApplication.Entity.Employee;
import com.myproject.SpringFirstApplication.Repository.EmployeeRepository;
import com.myproject.SpringFirstApplication.Service.Interfaces.IEmployeeService;
import org.modelmapper.ModelMapper;

import java.util.List;

public class EmployeeService implements IEmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper mapper;
    final AddressService addressService;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper mapper, AddressService addressService) {
        this.employeeRepository = employeeRepository;
        this.mapper = mapper;
        this.addressService = addressService;
    }

    @Override
    public EmployeeResponse Get(int id) {
        Employee employee=employeeRepository.findById(id).orElse(null);
        EmployeeResponse singleEmployee = mapper.map(employee,EmployeeResponse.class);
        singleEmployee.setAddress(addressService.Get(employee.getAddressid()));
        return singleEmployee;
    }

    @Override
    public void Create(EmployeeDTO employee) {
        Employee insertedEmployee = mapper.map(employee,Employee.class);
        employeeRepository.save(insertedEmployee);
    }

    @Override
    public List<EmployeeResponse> GetAll() {
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeResponse> employees = new java.util.ArrayList<>(List.of());
        for(Employee emp:employeeList){
            EmployeeResponse employee = mapper.map(emp,EmployeeResponse.class);
            employee.setAddress(addressService.Get(emp.getAddressid()));
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public void Delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeResponse Update(EmployeeDTO employee,int id) {
        Employee savedEmployee=employeeRepository.findById(id).orElse(null);
        if(savedEmployee!=null){
            savedEmployee.setName(employee.getName());
            savedEmployee.setPhoneno(employee.getPhoneno());
            savedEmployee.setEmail(employee.getEmail());
            savedEmployee.setDOB(employee.getDOB());
            savedEmployee.setDOJ(employee.getDOJ());
            savedEmployee.setSalary(employee.getSalary());
            savedEmployee.setAddressid(employee.getAddressid());
            Employee emp=employeeRepository.save(savedEmployee);
            return Get(emp.getId());
        }
        else return null;
    }
}
