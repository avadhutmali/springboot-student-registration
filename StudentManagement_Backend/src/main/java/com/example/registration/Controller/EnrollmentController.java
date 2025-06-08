package com.example.registration.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Repository.EnrollmentRepository;
import com.example.registration.Service.EnrollmentService;
import com.example.registration.model.Course;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/api/enrollement")
public class EnrollmentController {

    private EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService){
        this.enrollmentService = enrollmentService;
    }

    @PostMapping
    public String enrollStudnet(@RequestParam int student_id, @RequestParam int course_id) {
        enrollmentService.enrollStudent(student_id, course_id);
        return "Student "+student_id+" "+course_id;
    }
    
    
    @GetMapping("/student/{id}")    
    public List<Course> getCourseByStudentId(@PathVariable int id) {
        return enrollmentService.findCourseIdsByStudentId(id);
    }
    
}
