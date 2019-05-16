package com.jaehong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student) {
        student.setCreated(new Date());
        student.setStudentStatus(StudentStatus.DRAFT);
        return studentRepository.save(student);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("===============");
        System.out.println("Hello");
    }
}
