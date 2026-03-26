package com.example.emailgenerator.controller;

import com.example.emailgenerator.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/generate")
    public String generateEmail(@RequestParam String topic) {
        return emailService.generateEmail(topic);
    }
}