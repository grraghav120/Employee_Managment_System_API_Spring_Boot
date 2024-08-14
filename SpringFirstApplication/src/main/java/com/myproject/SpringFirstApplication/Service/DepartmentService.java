package com.myproject.SpringFirstApplication.Service;

import com.myproject.SpringFirstApplication.DTO.DepartmentDTO;
import com.myproject.SpringFirstApplication.DTO.DepartmentReponse;
import com.myproject.SpringFirstApplication.Entity.Department;
import com.myproject.SpringFirstApplication.Repository.DepartmentRepository;
import com.myproject.SpringFirstApplication.Service.Interfaces.IDepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    final DepartmentRepository departmentRepository;
    final ModelMapper mapper;

    public DepartmentService(DepartmentRepository departmentRepository, ModelMapper mapper) {
        this.departmentRepository = departmentRepository;
        this.mapper = mapper;
    }

    @Override
    public DepartmentReponse Get(int id) {
        Department department =departmentRepository.findById(id).orElse(null);
        return mapper.map(department,DepartmentReponse.class);
    }

    @Override
    public void Create(DepartmentDTO department) {
        departmentRepository.save(mapper.map(department,Department.class));
    }

    @Override
    public List<DepartmentReponse> GetAll() {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentReponse> departmentList= new java.util.ArrayList<>(List.of());
        for(Department department:departments){
            DepartmentReponse dep = mapper.map(department,DepartmentReponse.class);
            departmentList.add(dep);
        }
        return departmentList;
    }

    @Override
    public DepartmentReponse Update(DepartmentDTO department, int id) {
        Department dep=departmentRepository.findById(id).orElse(null);
        if(dep!=null){
            dep.setName(department.getName());
            dep.setHOD(department.getHOD());
            Department d = departmentRepository.save(dep);
            return mapper.map(d,DepartmentReponse.class);
        }
        return null;
    }

    @Override
    public void Delete(int id) {
        departmentRepository.deleteById(id);
    }
}
