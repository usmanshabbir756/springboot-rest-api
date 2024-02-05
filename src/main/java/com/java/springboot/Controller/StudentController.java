package com.java.springboot.Controller;

import com.java.springboot.Bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    //{id} - URI template veriable
    // http://localhost:8080/students/1/usman/shabbir
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student getSudentWithId(@PathVariable("id") int StudentId,
                                   @PathVariable("first-name") String firstName,
                                   @PathVariable("last-name") String lastName){
        return new Student(StudentId,firstName,lastName);
    }


    // http://localhost:8080/students/query?id=2&firstName=usman&lastName=shabbir
    @GetMapping("students/query")
    public Student studentVeriableRequestParam(@RequestParam int id,
                                               @RequestParam String firstName,
                                               @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }

}
