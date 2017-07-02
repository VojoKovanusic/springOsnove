package com.luv2code.springdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int Id;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Column(name = "last_name")
	private String lastName;

	@DateTimeFormat( pattern = "dd/MM/yyyy")
	@NotNull
	@Past(message="enter in format dd/MM/yyyy ")
	@Column(name = "birthday")
	private Date birthday;
	
	
	@Email(message="enter valide email adress")
	@Column(name = "email")
	private String email;

	@Column(name = "salary")
	private double salary;

	@Column(name = "bruto_salary")
	private double brutoSalary;


	@Column(name = "jib")
	private int jib;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "register_date")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date registrationDate;

	@Column(name = "team")
	private String team;

	public Customer() {

		registrationDate = new Date();

	}

	public double getBrutoSalary() {
		return brutoSalary;
	}

	public void setBrutoSalary(double brutoSalary) {
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
