package com.glf.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glf.projeto1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
