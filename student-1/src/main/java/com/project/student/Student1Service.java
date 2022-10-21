package com.project.student;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.student.Student1;


@SuppressWarnings("unused")
@Service
@Transactional
public class Student1Service {
	
	@Autowired
	private Student1Repository studentRepository;
	
	public Student1 registerStudent(Student1 student) {
		return studentRepository.save(student);
	}
	
	public List<Student1> getStudents(){
		return (List<Student1>) studentRepository.findAll();		 
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
	
	public Student1 updateStudent(Student1 student) {
		Integer rollNumber = student.getRollNumber();
		Student1 std = studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setAddress(student.getAddress());
		std.setPercentage(student.getPercentage());
		return studentRepository.save(std);
	}
	
	
	
	/*// Insert/Create/update a Data
	public void create(Student1 s)
	{
		studentRepository.save(s);
	}
		
	// To retrieve a single record
	public Student1 retrieve(Integer id)
	{
	return studentRepository.findById(id).get();
	}
	*/
}