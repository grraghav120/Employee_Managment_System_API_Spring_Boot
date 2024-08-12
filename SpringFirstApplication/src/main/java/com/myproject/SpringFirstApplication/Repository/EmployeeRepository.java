package com.myproject.SpringFirstApplication.Repository;

import com.myproject.SpringFirstApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
