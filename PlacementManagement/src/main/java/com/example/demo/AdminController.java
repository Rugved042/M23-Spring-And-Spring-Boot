package com.example.demo;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController 
{
	@Autowired
	private AdminService admin_service;
	
	//creation
	@PostMapping("/admin")
	public void add(@RequestBody Admin a)
	{
		admin_service.create(a);
	}
	
	// Deletion
	@DeleteMapping("/admin/{admin_id}")
	public void remove(@PathVariable Integer admin_id)
	{
		admin_service.delete(admin_id);
	}
	
	//Retrieve All Data
	@GetMapping("/admin")
	public List<Admin> list()
	{
		return admin_service.listAll();	
	}
	
	//Retrieve with specific id
	@GetMapping("/admin/{admin_id}")
	public ResponseEntity<Admin> get(@PathVariable Integer admin_id)
	{
		try
		{
			Admin a = admin_service.retrieve(admin_id);
			return new ResponseEntity<Admin>(a,HttpStatus.OK);	
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Update data for specific id
	@PutMapping("/admin/{admin_id}")
	public ResponseEntity<Admin> update(@RequestBody Admin a,@PathVariable Integer admin_id)
	{
		try
		{
			@SuppressWarnings("unused")
			Admin a1 = admin_service.retrieve(admin_id);
			admin_service.create(a);
			return new ResponseEntity<Admin>(a,HttpStatus.OK);	
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);			}
		}	
}
