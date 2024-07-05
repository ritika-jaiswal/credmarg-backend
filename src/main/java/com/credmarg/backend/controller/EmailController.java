package com.credmarg.backend.controller;

import com.credmarg.backend.model.EmailDetails;
import com.credmarg.backend.repository.EmailRepository;
import com.credmarg.backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class EmailController {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired private EmailService emailService;

    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
        String status
                = emailService.sendSimpleMail(details);

        return status;
    }

    @GetMapping("/getAllEmails")
    public Iterable<EmailDetails> getAllEmails() {
        return  emailRepository.findAll();
    }
}