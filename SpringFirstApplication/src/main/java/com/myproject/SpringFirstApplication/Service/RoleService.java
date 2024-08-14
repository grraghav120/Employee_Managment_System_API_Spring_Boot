package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.RoleDTO;
import com.myproject.SpringFirstApplication.DTO.RoleResponse;
import com.myproject.SpringFirstApplication.Service.Interfaces.IRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Override
    public RoleResponse Get(int id) {
        return null;
    }

    @Override
    public void Create(RoleDTO employee) {

    }

    @Override
    public List<RoleResponse> GetAll() {
        return List.of();
    }

    @Override
    public RoleResponse Update(RoleDTO employee, int id) {
        return null;
    }

    @Override
    public void Delete(int id) {

    }
}
