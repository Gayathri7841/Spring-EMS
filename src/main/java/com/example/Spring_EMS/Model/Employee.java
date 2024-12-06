package com.example.Spring_EMS.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employ")
public class Employee {
	public Employee(){
		
	}
public Employee(Long sid, String firstname, String lastname, String email) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="id")
private Long sid;
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;
@Column(name="email")
private String email;
public Long getSid() {
	return sid;
}
public void setSid(Long sid) {
	this.sid = sid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
