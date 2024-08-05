package com.app.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jobId;
	
	@Column(length = 50)
	private String jobTitle;
	
	@Column(length = 50)
	private String role;
	
	@Column(length = 50,nullable = false)
	private String keySkills;
	
	@Column(nullable = false)
	private double salary;
	
	@Column(length = 500)
	private String description;
	
	@Column(nullable = false)
	private int vacancies;
	
	@Column(nullable = false)
	private LocalDate applicationDeadline;
	
	

}
