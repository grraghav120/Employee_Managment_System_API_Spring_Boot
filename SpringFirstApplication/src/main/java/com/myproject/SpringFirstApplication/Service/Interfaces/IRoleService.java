package com.myproject.SpringFirstApplication.Service.Interfaces;

import com.myproject.SpringFirstApplication.DTO.RoleDTO;
import com.myproject.SpringFirstApplication.DTO.RoleResponse;

import java.util.List;

public interface IRoleService {
    public RoleResponse Get(int id);
    public void Create(RoleDTO employee);
    public List<RoleResponse> GetAll();
    public RoleResponse Update(RoleDTO employee,int id);
    public void Delete(int id);
}
