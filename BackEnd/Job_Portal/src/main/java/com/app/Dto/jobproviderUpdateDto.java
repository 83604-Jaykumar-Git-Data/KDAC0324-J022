package com.app.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class jobproviderUpdateDto {
	
	private String jpName;
	private String username;
	private String password;
	private String email;
	private String address;
	private String websites;
	
	private String phoneno;

}
