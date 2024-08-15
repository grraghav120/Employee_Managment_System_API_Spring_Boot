package com.myproject.SpringFirstApplication.Controller;


import com.myproject.SpringFirstApplication.DTO.RoleDTO;
import com.myproject.SpringFirstApplication.DTO.RoleResponse;
import com.myproject.SpringFirstApplication.Service.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    IRoleService roleService;

    @GetMapping("{id}")
    public RoleResponse Get(@PathVariable int id){
        return roleService.Get(id);
    }

    @GetMapping()
    public List<RoleResponse> GetAll(){
        return roleService.GetAll();
    }

    @PostMapping()
    public void Create(@RequestBody RoleDTO role){
        roleService.Create(role);
    }

    @PutMapping("{id}")
    public RoleResponse Update(@RequestBody RoleDTO role,@PathVariable int id){
        return roleService.Update(role,id);
    }

}
