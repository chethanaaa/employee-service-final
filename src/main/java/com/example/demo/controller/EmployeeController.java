package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(value="/")
	public List<EmployeeEntity> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
	
	@GetMapping(value="/{id}")
	public EmployeeEntity getEmployee(@PathVariable("id") String id)
	{
		return service.getEmployee(id);
	}
	
	

}
