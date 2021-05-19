package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeEntity;

@Service
public class EmployeeService {
	
	private static Map<String, EmployeeEntity> employeeMap = new HashMap<String, EmployeeEntity>();
	
	static {
		
		employeeMap.put("1", new EmployeeEntity("1", "Anuj", "Kumar", "IT",20000));
		employeeMap.put("2", new EmployeeEntity("2", "Saket", "Kumar", "HR",25000));
		employeeMap.put("3", new EmployeeEntity("3", "Arjun", "Kumar", "IT",25000));
		employeeMap.put("4", new EmployeeEntity("4", "Tom", "Jerry", "Admin",30000));
		employeeMap.put("5", new EmployeeEntity("5", "John", "Albert", "Sales",40000));
	}
	
	public List<EmployeeEntity> getAllEmployees()
	{
		return employeeMap.values().stream()
			    .collect(Collectors.toList());
	}
	
	public EmployeeEntity getEmployee(String id)
	{
		return employeeMap.get(id);
	}
	
	public EmployeeEntity addEmployeeEntity(EmployeeEntity e)
	{
		employeeMap.put(e.getId(), e);
		return e;
	}
	
	

}
