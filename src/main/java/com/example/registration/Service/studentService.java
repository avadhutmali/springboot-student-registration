package com.example.registration.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.registration.Repository.StudentRepository;
import com.example.registration.model.Student;

@Service
public class studentService {
    private StudentRepository studentRepository;

    public studentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public int save(Student student){
        return studentRepository.saveStudent(student);
    }

    public Student getById(int id){
        return studentRepository.getStudentById(id);
    }

    public List<Student> getAllStudents(){
        return studentRepository.getAllStudent();
    }
}
