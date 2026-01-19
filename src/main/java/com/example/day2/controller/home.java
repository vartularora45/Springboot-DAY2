package com.example.day2.controller;

import com.example.day2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class home {
    @GetMapping("/about")
    public StudentModel getStudentData(){
        StudentModel s = new StudentModel(1,"VARTUL","aroravartul@gmail.com");
        return s;
    }
}
