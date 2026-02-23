package com.vib.jobtracker.controller;

import com.vib.jobtracker.common.ApiResponse;
import com.vib.jobtracker.exception.ResourceNotFoundException;
import com.vib.jobtracker.model.JobApplication;
import com.vib.jobtracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller responsible for handling HTTP requests
 * related to Job Applications.
 *
 * Base URL: /api/jobs
 */
@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {

    // Service layer dependency (Business Logic layer)
    private final JobApplicationService jobApplicationService;

    /**
     * Constructor-based Dependency Injection.
     * Spring automatically injects JobApplicationService bean here.
     */
    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    /**
     * CREATE a new Job Application
     *
     * Endpoint: POST /api/jobs
     * Request Body: JSON representation of JobApplication
     * Validation: @Valid ensures entity constraints are checked
     *
     * @param jobApplication JobApplication object parsed from request body
     * @return ApiResponse containing saved JobApplication
     */
    @PostMapping
    public ApiResponse<JobApplication> createJob(
            @Valid @RequestBody JobApplication jobApplication) {

        // Delegates saving logic to Service layer
        JobApplication saved = jobApplicationService.saveJobApplication(jobApplication);

        // Wraps response in standardized API format
        return new ApiResponse<>(true, "Job created successfully", saved);
    }

    /**
     * FETCH all Job Applications
     *
     * Endpoint: GET /api/jobs
     *
     * @return ApiResponse containing list of JobApplications
     */
    @GetMapping
    public ApiResponse<List<JobApplication>> getAllJobs() {

        List<JobApplication> jobs = jobApplicationService.getAllJobApplications();

        return new ApiResponse<>(true, "Jobs fetched successfully", jobs);
    }

    /**
     * FETCH a specific Job Application by ID
     *
     * Endpoint: GET /api/jobs/{id}
     *
     * @param id ID extracted from URL path
     * @return ApiResponse containing requested JobApplication
     * @throws ResourceNotFoundException if job does not exist
     */
    @GetMapping("/{id}")
    public ApiResponse<JobApplication> getJobById(@PathVariable Long id) {

        // Attempt to fetch job from database
        JobApplication job = jobApplicationService
                .getJobApplicationById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Job not found"));

        return new ApiResponse<>(true, "Job fetched successfully", job);
    }

    /**
     * DELETE a Job Application by ID
     *
     * Endpoint: DELETE /api/jobs/{id}
     *
     * @param id ID of job to delete
     * @return ApiResponse confirming deletion
     */
    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteJob(@PathVariable Long id) {

        jobApplicationService.deleteJobApplication(id);

        return new ApiResponse<>(true, "Job deleted successfully", null);
    }
}