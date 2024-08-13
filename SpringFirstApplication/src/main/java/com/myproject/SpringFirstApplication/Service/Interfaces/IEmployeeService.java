package com.myproject.SpringFirstApplication.Service.Interfaces;

import com.myproject.SpringFirstApplication.DTO.EmployeeDTO;
import com.myproject.SpringFirstApplication.DTO.EmployeeResponse;

import java.util.List;

public interface IEmployeeService {
    public EmployeeResponse Get(int id);
    public void Create(EmployeeDTO employee);
    public List<EmployeeResponse> GetAll();
    public EmployeeDTO Update(EmployeeDTO employee,int id);
    public void Delete(int id);
}
