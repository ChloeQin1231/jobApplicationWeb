package com.chloe.jobApplicationWeb.repository;

import com.chloe.jobApplicationWeb.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    //find users by email
    Optional<Users> findByEmail(String email);
}
