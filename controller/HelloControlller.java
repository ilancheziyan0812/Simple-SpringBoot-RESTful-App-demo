package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class HelloControlller {

	@Autowired
	UserService us;
	
	@GetMapping(path = "/getall")
	public List<User> findAll()
	{
		return us.displayAll();
		
	}
	
	@GetMapping("/getbyid/{id}")
	public User getById(@PathVariable int id)
	{
		return us.getById(id);
	}
	
	@GetMapping("/removebyid/{id}")
	public void removeById(@PathVariable int id)
	{
		us.removeById(id);
	}
	
	
}
