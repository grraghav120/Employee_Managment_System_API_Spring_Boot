package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.RoleDTO;
import com.myproject.SpringFirstApplication.DTO.RoleResponse;
import com.myproject.SpringFirstApplication.Entity.Role;
import com.myproject.SpringFirstApplication.Repository.RoleRepository;
import com.myproject.SpringFirstApplication.Service.Interfaces.IRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    final RoleRepository roleRepository;
    final ModelMapper mapper;

    public RoleService(RoleRepository roleRepository, ModelMapper mapper) {
        this.roleRepository = roleRepository;
        this.mapper = mapper;
    }

    @Override
    public RoleResponse Get(int id) {
        Role role=roleRepository.findById(id).orElse(null);
        return mapper.map(role,RoleResponse.class);
    }

    @Override
    public void Create(RoleDTO role) {
        roleRepository.save(mapper.map(role, Role.class));
    }

    @Override
    public List<RoleResponse> GetAll() {
        List<Role> roles=roleRepository.findAll();
        List<RoleResponse> roleList= new java.util.ArrayList<>(List.of());
        for(Role role:roles) roleList.add(mapper.map(role,RoleResponse.class));
        return roleList;
    }

    @Override
    public RoleResponse Update(RoleDTO role, int id) {
        Role getRole=roleRepository.findById(id).orElse(null);
        if(getRole!=null){
            getRole.setName(role.getName());
            return mapper.map(roleRepository.save(getRole),RoleResponse.class);
        }
        return null;
    }

    @Override
    public void Delete(int id) {
        roleRepository.deleteById(id);
    }
}
