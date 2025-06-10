package com.vib.jobtracker.controller;

import com.vib.jobtracker.model.JobApplication;
import com.vib.jobtracker.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //this class handles REST APIs and returns JSON instead of HTML
@RequestMapping("/api/jobs")
public class JobApplicationController {
    private final JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }
    @PostMapping
    public JobApplication createJob(@RequestBody JobApplication jobApplication) {
        return jobApplicationService.saveJobApplication(jobApplication);
    }
    @GetMapping
    public List<JobApplication> getAllJobs() {
        return jobApplicationService.getAllJobApplications();
    }
    @GetMapping("/{id}")
    public Optional<JobApplication> getJobById(@PathVariable Long id) {
        return jobApplicationService.getJobApplicationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {
        jobApplicationService.deleteJobApplication(id);
    }
}


