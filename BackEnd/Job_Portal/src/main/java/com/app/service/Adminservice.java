package com.app.service;

import java.util.Optional;

import com.app.Dto.AdminRegisterDto;
import com.app.entites.Admin;

public interface Adminservice {
	
	String insertAdmin (AdminRegisterDto admin);
	
	Optional<Admin> signIn (String userName, String Password);

}
