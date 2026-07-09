package com.api.student.service;

import com.api.student.entity.Student;
import com.api.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepo;

    public StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getAllInfo() {
        return  studentRepo.findAll();
    }

    public Student getId(int id) {
         return studentRepo.findById(id).orElse(null);

    }

   public Student createInfo(Student student){
        return studentRepo.save(student);
   }

   public String deleteOrder(int id) {
        if(studentRepo.existsById(id)) {
            try {
                studentRepo.deleteById(id);
                return "Order Deleted";
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
   }


}
