package com.vib.jobtracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Entity class representing a Job Application.
 *
 * This class is mapped to a database table by Hibernate (JPA).
 * Each instance of this class corresponds to one row in the table.
 *
 * It also contains validation constraints that are enforced
 * when the object is received as part of an HTTP request.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobApplication {

    /**
     * Primary Key of the table.
     *
     * @Id marks this field as the primary key.
     * @GeneratedValue allows the database to auto-generate the value.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Name of the company where the user applied.
     *
     * @NotBlank ensures this field:
     * - is not null
     * - is not empty
     * - does not contain only whitespace
     */
    @NotBlank(message = "Company name is required")
    private String companyName;

    /**
     * Job title for the applied position.
     */
    @NotBlank(message = "Job title is required")
    private String jobTitle;

    /**
     * Current status of the job application.
     * Example values:
     * Applied, Interview, Rejected, Offer
     *
     * NOTE: In future, this should be converted to an Enum
     * to restrict allowed values.
     */
    @NotNull(message = "Status is required")
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    public enum ApplicationStatus {
        APPLIED,
        OA,
        INTERVIEW,
        HR_ROUND,
        OFFER,
        REJECTED,
        WITHDRAWN
    }
    /**
     * Date when the application was submitted.
     *
     * @PastOrPresent ensures the date is:
     * - today
     * - or in the past
     * Future dates are not allowed.
     */
    @PastOrPresent(message = "Date must be in the past or today")
    private LocalDate dateApplied;

    /**
     * Optional notes related to the job application.
     * No validation applied — can be null.
     */
    private String notes;
}