package com.app.Dto;

import com.app.entites.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InsertJobseekerDto {
   
private String jsFullName;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String address;
	
	private String phoneno;
	
	private Gender gender;
	
	private String education;
	
	private String skill1;
	
	private String skill2;
	
	private String skill3;
	
	private int experience;
}
