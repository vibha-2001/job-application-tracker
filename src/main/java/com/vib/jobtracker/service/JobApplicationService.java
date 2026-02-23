package com.vib.jobtracker.service;

import com.vib.jobtracker.model.JobApplication;
import com.vib.jobtracker.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Layer responsible for handling business logic
 * related to Job Applications.
 *
 * This layer acts as a bridge between:
 * Controller (HTTP layer)
 * and
 * Repository (Database layer)
 *
 * Any business rules or validations beyond simple CRUD
 * should be implemented here.
 */
@Service
public class JobApplicationService {

    // Repository dependency for database operations
    private final JobApplicationRepository jobApplicationRepository;

    /**
     * Constructor-based Dependency Injection.
     * Spring injects JobApplicationRepository automatically.
     */
    @Autowired
    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    /**
     * Saves a new JobApplication or updates an existing one.
     *
     * If jobApplication.id is null → INSERT operation.
     * If jobApplication.id exists → UPDATE operation.
     *
     * @param jobApplication JobApplication entity to persist
     * @return Saved JobApplication entity from database
     */
    public JobApplication saveJobApplication(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }

    /**
     * Retrieves all JobApplications from database.
     *
     * @return List of JobApplication entities
     */
    public List<JobApplication> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }

    /**
     * Retrieves a specific JobApplication by its ID.
     *
     * Returns Optional because:
     * - The record may or may not exist.
     * - Avoids returning null.
     *
     * @param id Primary key of JobApplication
     * @return Optional containing JobApplication if found
     */
    public Optional<JobApplication> getJobApplicationById(Long id) {
        return jobApplicationRepository.findById(id);
    }

    /**
     * Deletes a JobApplication by its ID.
     *
     * If ID does not exist, repository may throw exception.
     * In production systems, we may validate existence first.
     *
     * @param id Primary key of JobApplication to delete
     */
    public void deleteJobApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }
}