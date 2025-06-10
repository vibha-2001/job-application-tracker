package com.vib.jobtracker.service;

import com.vib.jobtracker.model.JobApplication;
import com.vib.jobtracker.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class JobApplicationService {
    private final JobApplicationRepository jobApplicationRepository;

    @Autowired
    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    //Saves or updates a JobApplication entity.
    public JobApplication saveJobApplication(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    //Fetches all job applications from the database.
    public List<JobApplication> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }

    //Fetches a single job application by primary key (id).
    //Optional represents a container that may or may not contain a non-null value.
    public Optional<JobApplication> getJobApplicationById(Long id) {
        return jobApplicationRepository.findById(id);
    }

    //Deletes a job application from the database by id.
    public void deleteJobApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }


}
