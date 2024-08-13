package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.EmployeeDTO;

import java.util.List;

public interface IEmployeeService {
    public EmployeeDTO Get(int id);
    public void Create(EmployeeDTO employee);
    public List<EmployeeDTO> GetAll();
    public EmployeeDTO Update(EmployeeDTO employee,int id);
    public void Delete(int id);
}
