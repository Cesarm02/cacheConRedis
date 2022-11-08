package com.upc.cacheConRedis.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upc.cacheConRedis.domain.Student;
import com.upc.cacheConRedis.repository.StudentRepository;

@RestController
public class StudentController {

	private StudentRepository repos;
	
	 public StudentController(StudentRepository studentRepository) {
	        this.repos = studentRepository;
	    }
	
	@GetMapping("/")
	public Map<String, Student> findAll(){
		return repos.findAll();
	}
	
	@GetMapping("/{id}")
	public Student findById(@PathVariable String id) {
		return repos.findById(id);
	}
	
	@PostMapping("/")
	public void save(@RequestBody Student student) {
		repos.save(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repos.delete(id);
	}
	
}
