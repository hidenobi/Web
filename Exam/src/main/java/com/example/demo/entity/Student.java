package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "dob", nullable = false)
	private Date dob;
	@Column(name = "department", nullable = false)
	private String department;
	@Column(name = "approved", nullable = false)
	private int approved;
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	public int getApproved() {
//		return approved;
//	}
//	public void setApproved(int approved) {
//		this.approved = approved;
//	}
	
	
}
