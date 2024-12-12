package com.chloe.jobApplicationWeb.services;


import com.chloe.jobApplicationWeb.entity.UsersType;
import com.chloe.jobApplicationWeb.repository.UsersTypeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
