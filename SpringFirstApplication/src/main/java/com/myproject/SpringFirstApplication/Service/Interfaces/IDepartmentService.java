package com.myproject.SpringFirstApplication.Service.Interfaces;


import com.myproject.SpringFirstApplication.DTO.DepartmentDTO;
import com.myproject.SpringFirstApplication.DTO.DepartmentReponse;

import java.util.List;

public interface IDepartmentService {
    public DepartmentReponse Get(int id);
    public void Create(DepartmentDTO department);
    public List<DepartmentReponse> GetAll();
    public DepartmentReponse Update(DepartmentDTO department,int id);
    public void Delete(int id);
}
