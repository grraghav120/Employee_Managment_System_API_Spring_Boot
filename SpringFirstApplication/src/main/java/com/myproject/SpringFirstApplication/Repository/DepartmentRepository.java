package com.myproject.SpringFirstApplication.Repository;

import com.myproject.SpringFirstApplication.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
