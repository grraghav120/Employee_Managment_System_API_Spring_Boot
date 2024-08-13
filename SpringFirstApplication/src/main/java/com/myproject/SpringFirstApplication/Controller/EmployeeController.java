package com.myproject.SpringFirstApplication.Controller;

import com.myproject.SpringFirstApplication.DTO.EmployeeDTO;
import com.myproject.SpringFirstApplication.DTO.EmployeeResponse;
import com.myproject.SpringFirstApplication.Service.Interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("")
    public List<EmployeeResponse> GetAll(){
        return employeeService.GetAll();
    }

    @GetMapping("{id}")
    public EmployeeResponse Get(@PathVariable int id){
        return employeeService.Get(id);
    }

    @PostMapping()
    public void Create(@RequestBody EmployeeDTO employee){
        employeeService.Create(employee);
    }

    @PutMapping("{id}")
    public EmployeeResponse Update(@RequestBody EmployeeDTO employee,@PathVariable int id){
        return employeeService.Update(employee,id);
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id){
        employeeService.Delete(id);
    }
}
