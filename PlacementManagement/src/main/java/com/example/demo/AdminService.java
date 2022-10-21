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
	private AdminRepository adminrepo;
	
	// To retrieve all the data of admin class
	public List<Admin> listAll()
	{
		return adminrepo.findAll();
	}
	
	// insert/update a data
	public void create(Admin a)
	{
		adminrepo.save(a);
	}
	
	// to retrieve a single record
	public Admin retrieve(Integer adminid)
	{
		return adminrepo.findById(adminid).get();			
	}
	
	// to delete a data
	public void delete(Integer adminid)
	{
		adminrepo.deleteById(adminid);
	}
}
