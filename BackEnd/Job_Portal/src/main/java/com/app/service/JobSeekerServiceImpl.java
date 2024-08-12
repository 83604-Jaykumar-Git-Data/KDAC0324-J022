package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dto.InsertJobseekerDto;
import com.app.Dto.JobseekerSigninDto;
import com.app.Dto.Jobseekerupdatedto;
import com.app.Repositories.JobCategoryRepo;
import com.app.Repositories.JobSeekerRepo;
import com.app.entites.JobSeeker;
import com.app.entites.Jobcategory;


@Service
@Transactional
public class JobSeekerServiceImpl implements JobSeekerService{
	
	@Autowired
	private JobSeekerRepo jsrepo;
	
	@Autowired
	private JobCategoryRepo jcrepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public String insertJobSeeker(InsertJobseekerDto dto) {
		
		JobSeeker js =mapper.map(dto, JobSeeker.class);
		jsrepo.save(js);
		return "success";
	}

	@Override
	public JobSeeker signIn(String userName, String Password) {
		
		return jsrepo.findByUsernameAndPassword(userName, Password).get();
	}

	@Override
	public boolean updateJSByUserName(String userName, Jobseekerupdatedto updatedto) {
		Optional<JobSeeker> existingId =jsrepo.findByUsername(userName);
		
		if(existingId.isPresent()) {
			JobSeeker existingJobseeker=existingId.get();
			existingJobseeker.setJsfullname(updatedto.getJsfullname());
			existingJobseeker.setEmail(updatedto.getEmail());
			existingJobseeker.setAddress(updatedto.getEmail());
			existingJobseeker.setPhoneno(updatedto.getPhoneno());
			existingJobseeker.setGender(updatedto.getGender());
			existingJobseeker.setEducation(updatedto.getEducation());
			existingJobseeker.setSkill1(updatedto.getSkill1());
			existingJobseeker.setSkill2(updatedto.getSkill2());
			existingJobseeker.setSkill3(updatedto.getSkill3());
			existingJobseeker.setExperience(updatedto.getExperience());
			jsrepo.save(existingJobseeker);
             return true;
		}
		return false;
		
		
	}

	@Override
	public String deleteById(Long jsid) {
		if(jsrepo.existsById(jsid)) {
			jsrepo.deleteById(jsid);
			return "deleted succesfully";
			
		}
		return "deletation is not succesfully";
	}

	@Override
	public List<JobSeeker> getjobseeker() {
		
		return jsrepo.findAll();
	}

	@Override
	public List<Jobcategory> getallcategories() {
		
		return jcrepo.findAll();
	}
	
	

	

}
