package com.example.demo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminService 
{
	@Autowired
	private AdminRepository admin_repo;
	
	// To retrieve all the data of admin class
	public List<Admin> listAll()
	{
		return admin_repo.findAll();
	}
	
	// insert/update a data
	public void create(Admin a)
	{
		admin_repo.save(a);
	}
	
	// to retrieve a single record
	public Admin retrieve(Integer admin_id)
	{
		return admin_repo.findById(admin_id).get();			
	}
	
	// to delete a data
	public void delete(Integer admin_id)
	{
		admin_repo.deleteById(admin_id);
	}
}
