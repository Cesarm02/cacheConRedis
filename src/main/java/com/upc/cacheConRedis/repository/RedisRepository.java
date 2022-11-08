package com.upc.cacheConRedis.repository;

import java.util.Map;

import com.upc.cacheConRedis.domain.Student;

public interface RedisRepository {

	Map<String,  Student> findAll();
	Student findById(String id);
	void save(Student student);
	void delete(String id);
	
}
