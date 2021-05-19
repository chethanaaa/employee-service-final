package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

	
	private String id;
	private String firstName;
	private String lastName;
	private String deparatment;
	private long salary;
//	public EmployeeEntity(String string, String string2, String string3, String string4, int i) {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getDeparatment() {
//		return deparatment;
//	}
//	public void setDeparatment(String deparatment) {
//		this.deparatment = deparatment;
//	}
//	public long getSalary() {
//		return salary;
//	}
//	public void setSalary(long salary) {
//		this.salary = salary;
//	}
//	
	

}
