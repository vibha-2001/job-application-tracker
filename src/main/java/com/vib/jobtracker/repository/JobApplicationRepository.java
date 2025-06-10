package com.vib.jobtracker.repository;

import com.vib.jobtracker.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//
@Repository
//Marks this interface as a Spring-managed bean for DB operations.
//JobApplication is the Entity type
//Long is the type of the primary key
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
