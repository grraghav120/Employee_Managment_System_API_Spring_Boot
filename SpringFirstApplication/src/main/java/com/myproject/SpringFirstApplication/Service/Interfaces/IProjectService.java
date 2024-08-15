package com.myproject.SpringFirstApplication.Service.Interfaces;



import com.myproject.SpringFirstApplication.DTO.ProjectDTO;
import com.myproject.SpringFirstApplication.DTO.ProjectResponse;

import java.util.List;

public interface IProjectService {
    public ProjectResponse Get(int id);
    public void Create(ProjectDTO project);
    public List<ProjectResponse> GetAll();
    public ProjectResponse Update(ProjectDTO project,int id);
    public void Delete(int id);
}
