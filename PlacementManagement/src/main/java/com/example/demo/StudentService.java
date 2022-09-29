package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService 
{
	@Autowired
	private StudentRepository repo;
	
	// To retrieve all the data from student class
	public List<Student> listAll()
	{
		return repo.findAll();
	}
	
	// Insert/Creat/update a Data
	public void create(Student s)
	{
		repo.save(s);
	}
	
	// To retrieve a single record
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	// To delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
