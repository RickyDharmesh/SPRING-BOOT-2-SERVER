package com.api.student.controller;

import com.api.student.entity.Student;
import com.api.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student-info")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all-info")
    public List<Student> getInfo(){
        return studentService.getAllInfo();
    }
    @GetMapping("/{id}")
    public Student getInfoById(@PathVariable int id){
            return studentService.getId(id);
    }

    @PostMapping
    public Student createInfo(@RequestBody Student student) {
        return studentService.createInfo(student);
    }


    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {
        return studentService.deleteOrder(id);
    }


}
