package com.upc.cacheConRedis.repository;

import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.upc.cacheConRedis.domain.Student;

@Repository
public class StudentRepository implements RedisRepository {

	private static final String KEY = "Student";

	private RedisTemplate<String, Student> redisTemplate;

	private HashOperations hashOperations;

	public StudentRepository(RedisTemplate<String, Student> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public Map<String, Student> findAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public Student findById(String id) {
		return (Student) hashOperations.get(KEY, id);
	}

	// Llave - id Random - student
	@Override
	public void save(Student student) {
		hashOperations.put(KEY, UUID.randomUUID().toString(), student);
	}

	@Override
	public void delete(String id) {
		hashOperations.delete(KEY, id);
	}

}
