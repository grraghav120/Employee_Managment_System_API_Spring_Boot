package com.myproject.SpringFirstApplication.Controller;


import com.myproject.SpringFirstApplication.DTO.ProjectDTO;
import com.myproject.SpringFirstApplication.DTO.ProjectResponse;
import com.myproject.SpringFirstApplication.Service.Interfaces.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    IProjectService projectService;

    @GetMapping("{id}")
    public ProjectResponse Get(@PathVariable int id){
        return projectService.Get(id);
    }

    @GetMapping()
    public List<ProjectResponse> GetAll(){
        return projectService.GetAll();
    }

    @PostMapping()
    public void Crete(@RequestBody ProjectDTO project){
         projectService.Create(project);
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable int id){
        projectService.Delete(id);
    }

    @PutMapping("{id}")
    public ProjectResponse Update(@RequestBody ProjectDTO project,@PathVariable int id){
        return projectService.Update(project,id);
    }


}
