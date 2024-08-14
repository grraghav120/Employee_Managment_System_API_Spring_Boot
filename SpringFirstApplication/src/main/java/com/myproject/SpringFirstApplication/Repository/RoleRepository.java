package com.myproject.SpringFirstApplication.Repository;

import com.myproject.SpringFirstApplication.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
