package com.app.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entites.Job;
import com.app.entites.JobProivder;





public interface Jobrepo extends JpaRepository<Job, Long> {
	
	

}
