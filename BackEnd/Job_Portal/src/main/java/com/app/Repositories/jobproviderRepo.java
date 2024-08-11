package com.app.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entites.JobProivder;


public interface jobproviderRepo extends JpaRepository<JobProivder,Long>{
 
	Optional<JobProivder> findByUsernameAndPassword(String username,String password);
	
	Optional<JobProivder> findByUsername(String username);
	
}
