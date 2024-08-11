package com.app.controller;

import java.util.List;

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

import com.app.Dto.JobpostDto;
import com.app.Dto.JobseekerSigninDto;
import com.app.Dto.insertJobproviderDto;
import com.app.Dto.jobproviderSigninDto;
import com.app.Dto.jobproviderUpdateDto;
import com.app.entites.JobProivder;
import com.app.service.jobproviderservice;



@RestController
@RequestMapping("/jobprovider")
@CrossOrigin("*")
public class jobproviderController {
	
	@Autowired
	private jobproviderservice jobproviderService;
	
	@PostMapping("/registration")
	public ResponseEntity<?> insertjobprovider(@RequestBody insertJobproviderDto dto){
		
		String result= jobproviderService. insertjobprovider(dto);
		return ResponseEntity.status(HttpStatus.OK).body(result);
		
	}
	
	@GetMapping("/allProvider")
	public ResponseEntity<?> getjobprovider(){
		
		List<JobProivder> result= jobproviderService. getjobprovider();
		return ResponseEntity.status(HttpStatus.OK).body(result);
		
	}
	
	@PostMapping("/signIn")
	public ResponseEntity<?> signin(@RequestBody jobproviderSigninDto dto){
		
		return ResponseEntity.status(HttpStatus.OK).body(jobproviderService.signIn(dto.getUsername(),dto.getPassword()));
		
	}
	
	@PutMapping("/updatejp/{username}")
    public ResponseEntity<?> updateJp(@PathVariable String username,jobproviderUpdateDto dto){
		if(jobproviderService.UpdateJPByusername(username, dto)) return ResponseEntity.ok("Updatiation is done!!");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("updation is not Done Because of Wrong Informations!!!");
		
	}
      
	@DeleteMapping("/delete/{jpid}")
	public ResponseEntity<?>deleteById(@PathVariable Long jpid){
		return ResponseEntity.ok(jobproviderService.deleteById(jpid));
		
	}
	
	@PostMapping("/PostaJob")
	public ResponseEntity insertJob(@RequestBody JobpostDto dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(jobproviderService.insertJob(dto)) ;
		
	}
}
