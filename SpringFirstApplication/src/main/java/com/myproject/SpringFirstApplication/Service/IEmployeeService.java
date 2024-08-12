package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.Entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee Get(int id);
    public void Create(Employee employee);
    public List<Employee> GetAll();
    public Employee Update(Employee employee,int id);
    public void Delete(int id);
}
