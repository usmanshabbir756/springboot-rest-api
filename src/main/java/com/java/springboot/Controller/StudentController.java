package com.java.springboot.Controller;

import com.java.springboot.Bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    // http://localhost:8080/student/created
    @PostMapping("student/created")
    @ResponseStatus(HttpStatus.CREATED)
    public Student postStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    // http://localhost:8080/student/10/update
    @PutMapping("student/{id}/update")
    public Student putStudent(@RequestBody Student student,@PathVariable("id") int studentID){
        student.setId(studentID);
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }


    // http://localhost:8080/student/4/delete
    @DeleteMapping("student/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        System.out.println(studentId);
        return "Student deleted sucessfully";
    }


}
