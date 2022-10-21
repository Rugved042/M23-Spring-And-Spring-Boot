package com.project.student;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student1Repository extends CrudRepository<Student1, Integer>
{

}
