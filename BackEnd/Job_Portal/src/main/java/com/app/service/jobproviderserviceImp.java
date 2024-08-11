package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dto.JobpostDto;
import com.app.Dto.insertJobproviderDto;
import com.app.Dto.jobproviderUpdateDto;
import com.app.Repositories.Jobrepo;
import com.app.Repositories.jobproviderRepo;
import com.app.entites.Job;
import com.app.entites.JobProivder;


@Transactional
@Service
public class jobproviderserviceImp  implements jobproviderservice{

	@Autowired
	private jobproviderRepo jprepo;
	
	@Autowired
	private Jobrepo jobrepo;
	
	@Autowired
	public ModelMapper mapper;
	

	

	@Override
	public String insertjobprovider(insertJobproviderDto dto) {
		JobProivder jp =mapper.map(dto, JobProivder.class);
		
		jprepo.save(jp);
		
		return "success";
	}




	@Override
	public JobProivder signIn(String userName, String Password) {
		
		return jprepo.findByUsernameAndPassword(userName, Password).get();
	}




	@Override
	public boolean UpdateJPByusername(String userName, jobproviderUpdateDto jpdto) {
		
		Optional<JobProivder> existingId =jprepo.findByUsername(userName);
		
		if(existingId.isPresent()) {
			
		JobProivder exitstingJobProivder=existingId.get();
		exitstingJobProivder.setJpName(jpdto.getJpName());
		exitstingJobProivder.setUsername(jpdto.getUsername());
		exitstingJobProivder.setPassword(jpdto.getPassword());
		exitstingJobProivder.setEmail(jpdto.getEmail());
		exitstingJobProivder.setAddress(jpdto.getAddress());
		exitstingJobProivder.setWebsites(jpdto.getWebsites());
		exitstingJobProivder.setPhoneno(jpdto.getPhoneno());
		jprepo.save(exitstingJobProivder);
		return true;
		}
		return false;
	}




	@Override
	public String deleteById(Long jpId) {
		if(jprepo.existsById(jpId))
		{
			jprepo.deleteById(jpId);
		return "deleted succesfully";
		}
		return "deletation is not succesfully";
	}




	@Override
	public List<JobProivder> getjobprovider() {
		// TODO Auto-generated method stub
		return jprepo.findAll();
	}




	@Override
	public String insertJob(JobpostDto dto) {
		
		Job jb =mapper.map(dto, Job.class);
		
		jobrepo.save(jb);
		
		return "Success";
	}




	



	
	
	

	
	
	
	
}
