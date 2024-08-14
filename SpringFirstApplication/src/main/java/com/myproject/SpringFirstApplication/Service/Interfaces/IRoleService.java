package com.myproject.SpringFirstApplication.Service.Interfaces;

import com.myproject.SpringFirstApplication.DTO.RoleDTO;
import com.myproject.SpringFirstApplication.DTO.RoleResponse;

import java.util.List;

public interface IRoleService {
    public RoleResponse Get(int id);
    public void Create(RoleDTO role);
    public List<RoleResponse> GetAll();
    public RoleResponse Update(RoleDTO role,int id);
    public void Delete(int id);
}
