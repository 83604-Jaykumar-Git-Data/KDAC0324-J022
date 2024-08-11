package com.app.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "jobprovider")
public class JobProivder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long jpId;
	@Column(length = 40, nullable = false)
	private String jpName;
	
	@Column(length = 40, nullable = false)
	private String username;
	
	@Column(length = 40, nullable = false)
	private String password;
	
	@Column(unique = true, length=100)
	private String email;
	
	@Column(length = 40, nullable = false)
	private String address;
	
	@Column(length = 100)
	private String websites;
	
	@Column(length = 40, nullable = false)
	private String phoneno;
	
	
	
	
	

}
