package com.myproject.SpringFirstApplication.Controller;

import com.myproject.SpringFirstApplication.DTO.EmployeeDTO;
import com.myproject.SpringFirstApplication.Entity.Employee;
import com.myproject.SpringFirstApplication.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @GetMapping("")
    public List<EmployeeDTO> GetAll(){
        return employeeService.GetAll();
    }

    @GetMapping("{id}")
    public EmployeeDTO Get(@PathVariable int id){
        return employeeService.Get(id);
    }

    @PostMapping()
    public void Create(@RequestBody EmployeeDTO employee){
        employeeService.Create(employee);
    }

    @PutMapping("{id}")
    public EmployeeDTO Update(@RequestBody EmployeeDTO employee,@PathVariable int id){
        return employeeService.Update(employee,id);
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id){
        employeeService.Delete(id);
    }
}
