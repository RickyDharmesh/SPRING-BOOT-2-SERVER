package com.api.marks.service;
import com.api.marks.dto.Student;
import org.springframework.web.client.RestTemplate;
import com.api.marks.entity.Mark;
import com.api.marks.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;
@Service
public class MarkService {

    @Autowired
    private MarkRepository markRepo ;

    private final RestTemplate restTemplate;
    public MarkService(MarkRepository markRepo,RestTemplate restTemplate) {
        this.markRepo = markRepo;
        this.restTemplate = restTemplate;
    }

    // get all info
    public  List<Mark> getAllInfo(){
        return markRepo.findAll();
    }

    //get one info
    public Mark getInfoById(int id) {
        return markRepo.findById(id).orElse(null);
    }

    //post one info
    public Student createInfo(Mark mark) {
        Student student = restTemplate.getForObject(
                "http://localhost:8080/api/v1/student-info/" + mark.getStudentId(),
                Student.class
        );

        markRepo.save(mark);

        Student response = new Student();

        assert student != null;
        response.setStudentId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());

        response.setPhyMark(mark.getPhyMark());
        response.setMathMark(mark.getMathMark());
        response.setChemMark(mark.getChemMark());

        response.setCutoff( ( ( mark.getPhyMark()  + mark.getChemMark() ) / 2) + mark.getMathMark() );

        return response;

    }

    //delete
    public String deleteInfo(int id) {
        if(markRepo.existsById(id)) {
            try {
                markRepo.deleteById(id);
                return "Order Deleted";
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

}


