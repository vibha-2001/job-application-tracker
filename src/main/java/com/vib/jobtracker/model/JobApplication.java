package com.vib.jobtracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor // Lombok: creates no-arg constructor
@AllArgsConstructor // Lombok: creates all-args constructor
// long id has to be p
public class JobApplication {
    @Id
    @GeneratedValue

    private Long id;

    @NotBlank(message = "Company name is required")
    private String companyName;

    @NotBlank(message = "Job title is required")
    private String jobTitle;

    @NotBlank
    private String status; // e.g. Applied, Interviewing, Rejected, Offered

    @PastOrPresent(message = "Date must be in the past or today")
    private LocalDate dateApplied; //YYYY-MM-DD

    //@JsonFormat(pattern = "dd-MM-yyyy")
    //private LocalDate dateApplied;

    private String notes;
}
