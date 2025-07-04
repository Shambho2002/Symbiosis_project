package com.example.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.College.model.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long>{

}
