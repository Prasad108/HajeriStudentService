package com.app.attendanceManager.studentservice.student;

import java.util.Optional;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface StudentRepository extends  ElasticsearchRepository<Student, String> {
	
	Optional<Student> findById(String primaryKey); 
	void deleteById(String primaryKey); 

}
