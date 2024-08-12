package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entites.Jobcategory;


@Repository
public interface JobCategoryRepo extends JpaRepository<Jobcategory, Long> {

}
