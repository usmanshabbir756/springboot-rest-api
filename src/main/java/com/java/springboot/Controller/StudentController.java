package com.java.springboot.Controller;

import com.java.springboot.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //HTTP GET REQUEST
    // http://localhost:8080/student
    @GetMapping("student")
    public Student studentData(){
        Student student=new Student(1,"usman","Shabbir");
        return student;
    }

}
