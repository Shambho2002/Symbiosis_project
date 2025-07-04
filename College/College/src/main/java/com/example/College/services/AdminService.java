package com.example.College.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.College.model.Admin;
import com.example.College.model.Classroom;
import com.example.College.model.Institute;
import com.example.College.model.Student;
import com.example.College.model.Subject;
import com.example.College.model.Teacher;
import com.example.College.repository.AdminRepository;
import com.example.College.repository.ClassroomRepository;
import com.example.College.repository.InstituteRepository;
import com.example.College.repository.StudentRepository;
import com.example.College.repository.SubjectRepository;
import com.example.College.repository.TeacherRepository;

@Service

public class AdminService {
	  @Autowired
	    private TeacherRepository teacherRepo;
	    @Autowired
	    private ClassroomRepository classroomRepo;
	    @Autowired
	    private SubjectRepository subjectRepo;
	    @Autowired
	    private StudentRepository studentRepo;
	    @Autowired
	    private AdminRepository adminRepo;
	    @Autowired
	    private  InstituteRepository instRepo;
	    
	    
	    
	    public Institute instAdd(Institute institute) {
			return instRepo.save(institute);
	    	
	    }
	    
	    public Institute instFindbyId(Long id) {
			return instRepo.findById(id)
					.orElseThrow(() -> new RuntimeException("Institute not found with id: " + id));
			
	    	
			
	    }
	    
	    public Admin adminLogin(Admin admin) {
			return adminRepo.save(admin);
			
	    	
	    }

	    public List<Teacher> getAllTeachers() {
	        return teacherRepo.findAll();
	    }

	    public List<Classroom> getAllClassrooms() {
	        return classroomRepo.findAll();
	    }

	    public Classroom addClassroom(Classroom classroom) {
	        return classroomRepo.save(classroom);
	    }

	    public Subject addSubject(Subject subject) {
	        return subjectRepo.save(subject);
	    }
	    
	    
	    public Classroom findById(Long id) {
	    	
	        return classroomRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Classroom not found with id: " + id));
	    }
	 
	    
	    public Teacher findteacherById(Long id) {
	        return teacherRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Teacher Id not found with id: " + id));
	    }
	 
	    
	    
	  

	    public void assignTeacherToSubject(Long subjectId, Long teacherId) {
	        Subject subject = subjectRepo.findById(subjectId).orElseThrow();
	        Teacher teacher = teacherRepo.findById(teacherId).orElseThrow();
	        subject.setTeacher(teacher);
	        subjectRepo.save(subject);
	    }
}
