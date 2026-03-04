package com.klu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Certification {

    @Value("C1001")
    private String id;

    @Value("Spring Boot Mastery")
    private String name;

    @Value("04-03-2026")
    private String dateOfCompletion;

    @Override
    public String toString() {
        return "Certification ID: " + id +
                "\nCertification Name: " + name +
                "\nDate Of Completion: " + dateOfCompletion;
    }
}