package com.credmarg.backend.service;


import com.credmarg.backend.model.EmailDetails;
import com.credmarg.backend.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


public interface EmailService {
    String sendSimpleMail(EmailDetails details);

}