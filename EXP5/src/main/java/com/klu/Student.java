package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("101")
    private int id;

    @Value("Deepika")
    private String name;

    @Value("Female")
    private String gender;

    private Certification certification;

    @Autowired   // Constructor Injection
    public Student(Certification certification) {
        this.certification = certification;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println(certification);
    }
}