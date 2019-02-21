package com.boyan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boyan.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
