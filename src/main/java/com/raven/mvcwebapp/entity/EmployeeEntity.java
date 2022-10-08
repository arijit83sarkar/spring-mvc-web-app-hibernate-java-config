package com.raven.mvcwebapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;

	@Column(name = "first_name", length = 20)
	private String firstName = "";

	@Column(name = "last_name", length = 20)
	private String lastName = "";

	@Column(name = "gender", length = 8)
	private String gender = "";

	@Column(name = "phone_number", length = 12)
	private String phoneNumber = "";

	@Column(name = "email", length = 60)
	private String email = "";

	@Column(name = "country", length = 15)
	private String country = "";

	@Column(name = "job_title", length = 40)
	private String jobTitle = "";

	public EmployeeEntity() {
	}

	public EmployeeEntity(String firstName, String lastName, String gender, String phoneNumber, String email,
			String country, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.country = country;
		this.jobTitle = jobTitle;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", email=" + email + ", country=" + country + ", jobTitle="
				+ jobTitle + "]";
	}

}
