package com.example.registration.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.registration.Repository.CourseRepository;
import com.example.registration.model.Course;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public int saveCourse(Course course){
        return courseRepository.addCourse(course);
    }

    public Course getCourseById(int id){
        return courseRepository.getCourseById(id);
    }

    public List<Course> getAllCourses(){
        return courseRepository.getAllCourses();
    }
}
