package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.Dto.AdminRegisterDto;
import com.app.Repositories.AdminRepo;
import com.app.entites.Admin;

@Transactional
@Service
public class AdminServiceImp implements Adminservice {
	
	@Autowired
	private AdminRepo adminerepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public Optional<Admin> signIn(String userName, String Password) {
		
		return adminerepo.findByAdminUsernameAndAdminPassword(userName, Password);
	}

	@Override
	public String insertAdmin(AdminRegisterDto admin) {
		// TODO Auto-generated method stub
		Admin adm =mapper.map(admin, Admin.class);
		
		adminerepo.save(adm);
		
		return "successfully register";
	}

}
