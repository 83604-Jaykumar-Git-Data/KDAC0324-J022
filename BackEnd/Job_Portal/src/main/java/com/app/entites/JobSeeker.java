package com.app.entites;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@JsonIgnoreProperties
@JsonIgnoreType
@Table(name = "jobseeker")
public class JobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long jsid;
	@Column(length = 100)
private String Jsfullname;
	@Column(length = 40, nullable = false, unique = true)
private String username;
	@Column( nullable = false)
private String password;
	//@Email
	@Column(unique = true, length = 100)
private String email;

	@Column(length = 300, nullable = false)
private String address;

@Column(length = 40, nullable = false)
private String phoneno;

@Enumerated(EnumType.STRING)
private Gender gender;
@Column(length = 40)
private String education;
@Column(length = 40)
private String skill1;

@Column(length = 40)
private String skill2;

@Column(length = 40)
private String skill3;

private int experience;

private Blob resume;
	

}
