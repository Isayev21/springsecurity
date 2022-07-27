package com.example.springsecurity.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author : AliIsayev
 * @mailto : aisayev@aris.az
 * @created : 7/27/2022, Wednesday
 **/
@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final List<Student> students = Arrays.asList(
         new Student(1,"Ali Isayev"),
         new Student(2,"Balasef Alizada"),
         new Student(3,"Ali Alizada")
    );


    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
            return students.stream()
                    .filter(student -> studentId.equals(student.getStudentId()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("Student " + studentId + " did not found"));
    }
}
