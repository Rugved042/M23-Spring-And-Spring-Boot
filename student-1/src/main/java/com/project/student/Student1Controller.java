package com.project.student;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.student.Student1;
import com.project.student.Student1Service;

@SuppressWarnings("unused")
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class Student1Controller {

	@Autowired
	private Student1Service studentService;

	@PostMapping("/register")
	public Student1 registerStudent(@RequestBody Student1 student) {
		return studentService.registerStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student1> getStudents(){
		return studentService.getStudents();		
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam Integer id) {
		studentService.deleteStudent(id);
	}
	
	@PutMapping("/update")
	public Student1 updateStudent(@RequestBody Student1 student) {
		return  studentService.updateStudent(student);
	}
	
	/*@PutMapping("/update/{id}")
	public ResponseEntity<Student1>update(@RequestBody Student1 s,@PathVariable Integer rollnumber)
	{
		try
		{
			@SuppressWarnings("unused")
			Student1 s1 = studentService.retrieve(rollnumber);
			studentService.create(s);
			return new ResponseEntity<Student1>(s,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student1>(HttpStatus.NOT_FOUND);
		}
	}
	*/
}