package com.credmarg.backend.repository;

import com.credmarg.backend.model.EmailDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailDetails, Long> {
}