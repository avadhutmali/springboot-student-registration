package com.example.registration.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Service.CourseService;
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
@RequestMapping("/api/course")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    @PostMapping
    public String addCourse(@RequestBody Course course) {
        int row = courseService.saveCourse(course);
        return row>0 ? "Course Added Succesfully" : "Error Occured";
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
    
    
    

}
