package com.myproject.SpringFirstApplication.Controller;

import com.myproject.SpringFirstApplication.DTO.DepartmentDTO;
import com.myproject.SpringFirstApplication.DTO.DepartmentReponse;
import com.myproject.SpringFirstApplication.Service.Interfaces.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    IDepartmentService departmentService;

    @GetMapping("{id}")
    public DepartmentReponse Get(@PathVariable int id){
        return departmentService.Get(id);
    }

    @GetMapping()
    public List<DepartmentReponse> GetAll(){
        return departmentService.GetAll();
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id){
        departmentService.Delete(id);
    }

    @PostMapping()
    public void Create(@RequestBody DepartmentDTO department){
        departmentService.Create(department);
    }

    @PutMapping("{id}")
    public DepartmentReponse Update(@PathVariable int id,@RequestBody DepartmentDTO department){
        return departmentService.Update(department,id);
    }

}
