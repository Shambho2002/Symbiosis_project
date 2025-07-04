package com.example.College.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.College.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>   {

	Optional<Teacher> findByNameAndEmail(String name, String email);
}
