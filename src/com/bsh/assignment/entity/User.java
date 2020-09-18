package com.bsh.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="empid")
	private int empId;
	
	@Column(name="dateofjoinning")
	private String dateOfJoinning;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="designation")
	private String designation;
	
	//__________________________________________________________________________________________
	public User()
	{// default constructor
	}

	//__________________________________________________________________________________________
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDateOfJoinning() {
		return dateOfJoinning;
	}

	public void setDateOfJoinning(String dateOfJoinning) {
		this.dateOfJoinning = dateOfJoinning;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	//__________________________________________________________________________________________
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", empId=" + empId + ", dateOfJoinning=" + dateOfJoinning
				+ ", email=" + email + ", password=" + password + ", designation=" + designation + "]";
	}
	
	//__________________________________________________________________________________________
	
	
}

