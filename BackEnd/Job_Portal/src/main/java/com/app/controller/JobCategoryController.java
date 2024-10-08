package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dto.JobCategoryInsertDto;
import com.app.entites.Jobcategory;
import com.app.service.JobCategoryService;

@RestController
@RequestMapping("/jobcategory")
public class JobCategoryController {
	
	@Autowired
	private JobCategoryService jobCategoryService;
	
	
	@PostMapping("/insertjc")
	public ResponseEntity<?> insertjobcategory(@RequestBody JobCategoryInsertDto jobCategory){
		String result =jobCategoryService.insertJobCategoryDetails(jobCategory);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
		
	}
	
	@GetMapping("/listofcategories")
	public List<Jobcategory> getAllCategories(){
		return jobCategoryService.allcategories();
		
	}
}
