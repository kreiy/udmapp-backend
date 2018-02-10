package com.udm.udmapp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udm.udmapp.domain.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
