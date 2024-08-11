package com.app.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entites.Admin;

@Repository
public interface AdminRepo  extends JpaRepository<Admin, Long>{
 
//Optional<Admin> findByAdminUserNameAndAdminPassword(String userName,String Password);
	
	Optional<Admin>findByAdminUsernameAndAdminPassword(String userName,String Password);
	
	//Optional<Admin> findByAdminUserName(String userName);
}
