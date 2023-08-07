package com.wipro.movielibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.movielibrary.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    // Custom method to find admin by username
    Admin findByUsername(String username);
}

