package com.ticket_tool.easyhelp.repository;

import com.ticket_tool.easyhelp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository <User, Integer> {
    User findByName(String name);
    
}