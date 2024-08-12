package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.app.Dto.JobCategoryInsertDto;
import com.app.Repositories.JobCategoryRepo;
import com.app.entites.Jobcategory;


@Transactional
@Service
public class JobCategoryServiceImpl  implements JobCategoryService{

	@Autowired
	private JobCategoryRepo jobCategoryRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	
	
	@Override
	public String insertJobCategoryDetails(JobCategoryInsertDto dto) {
		
		Jobcategory jm = mapper.map(dto,Jobcategory.class);
		
		jobCategoryRepo.save(jm);
		return "success";
	}




	@Override
	public List<Jobcategory> allcategories() {
		
		return jobCategoryRepo.findAll();
	}

}
