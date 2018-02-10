package com.udm.udmapp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udm.udmapp.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
