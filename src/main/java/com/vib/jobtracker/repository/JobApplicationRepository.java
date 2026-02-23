package com.vib.jobtracker.repository;

import com.vib.jobtracker.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Layer responsible for database interactions
 * related to JobApplication entity.
 *
 * This interface extends JpaRepository, which provides
 * built-in CRUD operations such as:
 *
 * - save()
 * - findAll()
 * - findById()
 * - deleteById()
 * - existsById()
 * - count()
 *
 * Spring Data JPA automatically generates the implementation
 * at runtime — no need to write SQL manually.
 *
 * <JobApplication, Long>
 * JobApplication → Entity type
 * Long → Type of Primary Key
 */
@Repository
public interface JobApplicationRepository
        extends JpaRepository<JobApplication, Long> {

    // Custom query methods can be added here in future.
    // Example:
    // List<JobApplication> findByCompanyName(String companyName);
}