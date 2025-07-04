package com.example.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.College.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {

}
