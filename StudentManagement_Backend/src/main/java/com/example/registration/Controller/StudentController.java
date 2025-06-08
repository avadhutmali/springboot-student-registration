package com.example.registration.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Service.studentService;
import com.example.registration.model.Student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentController {
    private studentService studentService;

    public StudentController(studentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        int rows = studentService.save(student);
        return rows>0 ? "Student Added Succesfully " : "Error Occured";
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getById(id);
    }
    
    
    

}
