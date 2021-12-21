package com.busenurtopuz.caloriecounter.controllers;

import com.busenurtopuz.caloriecounter.repositories.SystemUserRepository;
import com.busenurtopuz.caloriecounter.model.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemUserController {
    @Autowired
    private SystemUserRepository systemUserRepository;

    @GetMapping("/api/user/getAll")
    public Iterable<SystemUser> getAll(){
        return systemUserRepository.findAll();
    }
}
