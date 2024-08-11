package com.app.service;


import java.util.List;

import com.app.Dto.JobpostDto;
import com.app.Dto.insertJobproviderDto;
import com.app.Dto.jobproviderUpdateDto;
import com.app.entites.JobProivder;

public interface jobproviderservice {
  
	
	String insertjobprovider(insertJobproviderDto dto);
	
	JobProivder signIn(String userName, String Password);
	
	boolean UpdateJPByusername(String userName,jobproviderUpdateDto jpdto );
	
	String deleteById(Long jpId);

	List<JobProivder> getjobprovider();
	
	String  insertJob(JobpostDto dto);
	
}
