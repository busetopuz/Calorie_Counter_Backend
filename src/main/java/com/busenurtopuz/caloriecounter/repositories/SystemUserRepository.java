package com.busenurtopuz.caloriecounter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.busenurtopuz.caloriecounter.model.SystemUser;


public interface SystemUserRepository extends JpaRepository<SystemUser,Integer> {
    SystemUser findSystemUserByEmailEqualsAndPasswordHashEquals(String email, String passwordHash);
    SystemUser findSystemUserByEmailEquals(String email);
}
