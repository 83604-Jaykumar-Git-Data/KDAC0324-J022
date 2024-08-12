package com.app.service;

import java.util.List;

import com.app.Dto.JobCategoryInsertDto;
import com.app.entites.Jobcategory;

public interface JobCategoryService {
	
	String insertJobCategoryDetails(JobCategoryInsertDto dto);
	
	List<Jobcategory > allcategories();

}
