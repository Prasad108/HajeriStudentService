package com.app.attendanceManager.studentservice.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.attendanceManager.studentservice.exceptions.UserNotFound;


@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> findAll(){
		List<Student> studentList= new ArrayList<>(); 
		 studentRepository.findAll().forEach(e->studentList.add(e));
		 return studentList;
	}
	
	public Student findById(String id) {
		return studentRepository.findById(id).orElseThrow(()->new UserNotFound("User not found"));
	}
	
	public void deleteById(String id) {
		 studentRepository.deleteById(id);
	}

}
