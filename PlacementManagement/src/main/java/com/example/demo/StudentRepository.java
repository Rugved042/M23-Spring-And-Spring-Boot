package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/*JpaRepository is exist in screen data JPA dependencies and 
it contains all the CRUD operation of Spring JPA*/
public interface StudentRepository extends JpaRepository<Student,Integer> 
{
	
}
