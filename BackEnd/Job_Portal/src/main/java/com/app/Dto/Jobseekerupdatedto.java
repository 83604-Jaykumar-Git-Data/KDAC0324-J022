package com.app.Dto;

import com.app.entites.Gender;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Jobseekerupdatedto {
	
	private String Jsfullname;
	
	private String email;
	
	private String address;
	
	private String Phoneno;
	
	private Gender gender;
	
	private String education;
	
	private String skill1;
	
	private String skill2;
	
	private String skill3;
	
	private int experience;
	
	
}
