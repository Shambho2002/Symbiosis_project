package com.example.College.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.College.model.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByClassroomId(Long classId);
    Optional<Student> findByNameAndEmail(String name, String email);
}