package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int Id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "salary")
	private int salary;

	@Column(name = "bruto_salary")
	private int brutoSalary;
	
	@Column(name = "jib")
	private int jib;
	
	@Column(name="phone_number")
	private String 	phoneNumber;

	public Customer() {

	}
	public int getBrutoSalary() {
		return brutoSalary;
	}

	public void setBrutoSalary(int brutoSalary) {
		this.brutoSalary = brutoSalary;
	}

	public int getJib() {
		return jib;
	}

	public void setJib(int jib) {
		this.jib = jib;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + "salary" + salary + "]";
	}
}
