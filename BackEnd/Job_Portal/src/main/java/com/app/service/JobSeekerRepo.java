package com.app.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entites.JobSeeker;

public interface JobSeekerRepo extends JpaRepository<JobSeeker,Long> {
    
Optional<JobSeeker> findByUsernameAndPassword(String userName,String password);

Optional<JobSeeker> findByUsername(String username);

}
