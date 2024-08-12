package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dto.InsertJobseekerDto;
import com.app.Dto.JobseekerSigninDto;
import com.app.Dto.Jobseekerupdatedto;
import com.app.Dto.SignDto;
import com.app.entites.Admin;
import com.app.entites.JobSeeker;
import com.app.entites.Jobcategory;
import com.app.service.JobSeekerService;

@RestController
@RequestMapping("/jobseeker")
@CrossOrigin("*")
public class JobSeekerController {
	
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@PostMapping("/registration")
	public ResponseEntity<?> insertJobSeeker(@RequestBody InsertJobseekerDto dto){
		String result=jobSeekerService.insertJobSeeker(dto);
		return ResponseEntity.status(HttpStatus.OK).body(result);
		
	}
      

	@PostMapping("/signIn")
	public ResponseEntity<?> signin(@RequestBody JobseekerSigninDto dto){
		
		return ResponseEntity.status(HttpStatus.OK).body(jobSeekerService.signIn(dto.getUsername(),dto.getPassword()));
		
	}
	
	@PutMapping("/updateJS/{userName}")
	public ResponseEntity<?> updateJs(@PathVariable String userName,@RequestBody Jobseekerupdatedto updateDto) {
		if(jobSeekerService.updateJSByUserName(userName, updateDto)) return ResponseEntity.ok("Updatiation is done!!");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("updation is not Done Because of Wrong Informations!!!");
	}
	 
	@DeleteMapping("/delete/{jsid}")
	public ResponseEntity<?>deleteById(@PathVariable Long jsid){
		
		   return ResponseEntity.ok(jobSeekerService.deleteById(jsid));		
	}
	
	@GetMapping("/getallseeker")
	public ResponseEntity<?>getjobseeker(){
		List<JobSeeker> result = jobSeekerService.getjobseeker();
		return ResponseEntity.status(HttpStatus.OK).body(result);
		
	}
    
	@GetMapping("/getallCategories")
	public List<Jobcategory> getallcategories(){
		return jobSeekerService.getallcategories();
		
	}
	
	
}
