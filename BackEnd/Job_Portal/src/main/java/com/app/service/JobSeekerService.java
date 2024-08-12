package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Dto.InsertJobseekerDto;
import com.app.Dto.JobseekerSigninDto;
import com.app.Dto.Jobseekerupdatedto;
import com.app.entites.Admin;
import com.app.entites.JobSeeker;
import com.app.entites.Jobcategory;

public interface JobSeekerService {
	
	String insertJobSeeker(InsertJobseekerDto dto);

	JobSeeker signIn(String userName, String Password);
	
	boolean updateJSByUserName(String userName,Jobseekerupdatedto dto);
	
	String deleteById(Long jsid);
	
	
	List<JobSeeker> getjobseeker();
	
	 List<Jobcategory> getallcategories();
	
}
