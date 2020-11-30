package com.smartprojectmanager.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartprojectmanager.start.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
