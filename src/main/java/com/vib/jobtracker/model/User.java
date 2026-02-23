package com.vib.jobtracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users") // avoid reserved keyword conflicts
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Email used as username.
     * Must be unique.
     */
    @Email
    @NotBlank
    @Column(unique = true, nullable = false)
    private String email;

    /**
     * Encrypted password (NOT plain text).
     */
    @NotBlank
    @Column(nullable = false)
    private String password;

    /**
     * Role of the user (USER / ADMIN)
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
