package com.app.attendanceManager.studentservice.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/Student") 
public class StudentController {


	@Autowired
	StudentService studentService;
	
	@PostMapping("/")
	public Student Creat(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return studentService.findAll();
	}
	
	@GetMapping("/{id}")
	public Student findById(@PathVariable String id) {
		return studentService.findById(id);
	} 
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable String id) {
		 studentService.deleteById(id);
	} 
}
