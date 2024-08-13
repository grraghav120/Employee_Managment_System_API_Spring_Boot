package com.myproject.SpringFirstApplication.Repository;

import com.myproject.SpringFirstApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
