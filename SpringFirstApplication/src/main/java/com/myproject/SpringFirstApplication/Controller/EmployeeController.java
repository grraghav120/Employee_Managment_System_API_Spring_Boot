package com.myproject.SpringFirstApplication.Controller;

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
    public List<Employee> GetAll(){
        return employeeService.GetAll();
    }

    @GetMapping("{id}")
    public Employee Get(@PathVariable int id){
        return employeeService.Get(id);
    }

    @PostMapping()
    public void Create(@RequestBody Employee employee){
        employeeService.Create(employee);
    }

    @PutMapping("{id}")
    public Employee Update(@RequestBody Employee employee,@PathVariable int id){
        return employeeService.Update(employee,id);
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id){
        employeeService.Delete(id);
    }
}
