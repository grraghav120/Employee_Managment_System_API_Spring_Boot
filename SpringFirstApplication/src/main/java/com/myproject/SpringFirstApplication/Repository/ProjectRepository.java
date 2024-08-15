package com.myproject.SpringFirstApplication.Repository;

import com.myproject.SpringFirstApplication.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
