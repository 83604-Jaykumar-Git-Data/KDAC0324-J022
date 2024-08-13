package com.app.Dto;

import java.time.LocalDate;

import com.app.entites.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class JobpostDto {
	
	private String jobTitle;
	
	private String role;
	
	private String keySkills;
	
	private double salary;
	
	private double vacancies;
	
	private String description;
	
	private LocalDate applicationDeadline;
	
	private String websites;

}
