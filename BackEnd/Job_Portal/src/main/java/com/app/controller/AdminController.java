package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dto.AdminRegisterDto;
import com.app.Dto.SignDto;
import com.app.entites.Admin;
import com.app.service.Adminservice;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private Adminservice admineservice;
	
	@PostMapping("/signIn")
	public Optional<Admin> signIn(@RequestBody SignDto Signdto)
	{
		return admineservice.signIn(Signdto.getUserName(),Signdto.getPassword());
	}
    

	
	@PostMapping("/registration")
	public ResponseEntity<?> registerAdmin (@RequestBody AdminRegisterDto admin)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(admineservice.insertAdmin(admin));
		
	}
}
