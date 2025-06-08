package com.example.registration.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.registration.Repository.CourseRepository;
import com.example.registration.Repository.EnrollmentRepository;
import com.example.registration.model.Course;
import com.example.registration.model.Enrollment;

@Service
public class EnrollmentService {
    private EnrollmentRepository enrollmentRepository;
    private CourseRepository courseRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository,CourseRepository courseRepository){
        this.enrollmentRepository = enrollmentRepository;
        this.courseRepository = courseRepository;
    }

    public int enrollStudent(int student_id,int course_id){
        return enrollmentRepository.saveEnrollement(student_id,course_id);
    }

    public List<Course> findCourseIdsByStudentId(int student_id){
        List<Integer> courseIds = enrollmentRepository.findCourseIdsByStudentId(student_id);
        List<Course> courses = new ArrayList<>();
        List<Course> allCourses = courseRepository.getAllCourses();

        for(int course_id: courseIds){
            for(Course course:allCourses){
                if(course.getId()==course_id){
                    courses.add(course);
                    break;
                }
            }
        }
        return courses;
    }
}
