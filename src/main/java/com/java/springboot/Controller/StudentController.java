package com.java.springboot.Controller;

import com.java.springboot.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //HTTP GET REQUEST
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student=new Student(1,"usman","Shabbir");
        return student;
    }

    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Usman","Shabbir"));
        students.add(new Student(2,"umer","Shabbir"));
        students.add(new Student(3,"ali","Shabbir"));
        return students;
    }
}
