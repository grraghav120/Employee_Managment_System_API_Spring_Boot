package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.ProjectDTO;
import com.myproject.SpringFirstApplication.DTO.ProjectResponse;
import com.myproject.SpringFirstApplication.Entity.Project;
import com.myproject.SpringFirstApplication.Repository.ProjectRepository;
import com.myproject.SpringFirstApplication.Service.Interfaces.IProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService implements IProjectService {

    final private ProjectRepository projectRepository;
    final private ModelMapper mapper;

    public ProjectService(ProjectRepository projectRepository, ModelMapper mapper) {
        this.projectRepository = projectRepository;
        this.mapper = mapper;
    }

    @Override
    public ProjectResponse Get(int id) {
        Project project = projectRepository.findById(id).orElse(null);
        return mapper.map(project,ProjectResponse.class);
    }

    @Override
    public void Create(ProjectDTO project) {
        projectRepository.save(mapper.map(project, Project.class));
    }

    @Override
    public List<ProjectResponse> GetAll() {
        List<Project> projects = projectRepository.findAll();
        List<ProjectResponse> projectList= new ArrayList<>(List.of());
        for(Project project:projects) projectList.add(mapper.map(project,ProjectResponse.class));
        return projectList;
    }

    @Override
    public ProjectResponse Update(ProjectDTO project, int id) {
        Project singleProject = projectRepository.findById(id).orElse(null);
        if(singleProject!=null){
            singleProject.setName(project.getName());
            singleProject.setStatus(project.getStatus());
            singleProject.setStarttime(project.getStarttime());
            singleProject.setEndtime(project.getEndtime());
            return mapper.map(projectRepository.save(singleProject),ProjectResponse.class);
        }
        return null;
    }

    @Override
    public void Delete(int id) {
        projectRepository.deleteById(id);
    }
}
