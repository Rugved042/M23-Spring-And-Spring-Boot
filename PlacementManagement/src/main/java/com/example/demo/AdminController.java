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
	private AdminService adminservice;
	
	//creation
	@PostMapping("/ad")
	public void add(@RequestBody Admin a)
	{
		adminservice.create(a);
	}
	
	// Deletion
	@DeleteMapping("/ad/{adminid}")
	public void remove(@PathVariable Integer adminid)
	{
		adminservice.delete(adminid);
	}
	
	//Retrieve All Data
	@GetMapping("/ad")
	public List<Admin> list()
	{
		return adminservice.listAll();	
	}
	
	//Retrieve with specific id
	@GetMapping("/ad/{adminid}")
	public ResponseEntity<Admin> get(@PathVariable Integer adminid)
	{
		try
		{
			Admin a = adminservice.retrieve(adminid);
			return new ResponseEntity<Admin>(a,HttpStatus.OK);	
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Update data for specific id
	@PutMapping("/ad/{adminid}")
	public ResponseEntity<Admin> update(@RequestBody Admin a,@PathVariable Integer adminid)
	{
		try
		{
			@SuppressWarnings("unused")
			Admin a1 = adminservice.retrieve(adminid);
			adminservice.create(a);
			return new ResponseEntity<Admin>(a,HttpStatus.OK);	
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);			}
		}	
}
