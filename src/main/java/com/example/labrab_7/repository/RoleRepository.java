package com.example.labrab_7.repository;

import com.example.labrab_7.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByName (String name);
}