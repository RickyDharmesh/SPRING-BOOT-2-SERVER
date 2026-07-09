package com.api.marks.controller;


import com.api.marks.entity.*;
import com.api.marks.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.api.marks.dto.Student;
@RestController
@RequestMapping("/api/v1/marks")
public class markController {
    private final MarkService markService;

    public markController(MarkService markService) {
        this.markService = markService;
    }
    // get all marks
    @GetMapping("/getmarks")
    public List<Mark> getMarkInfo(){
        return markService.getAllInfo();
    }
    //get one info
    @GetMapping("/getmarks/{id}")
    public  Mark getById(@PathVariable int id) {
        return markService.getInfoById(id);
    }

    @PostMapping
    public Student createInfo(@RequestBody Mark mark) {
        return markService.createInfo(mark);
    }

    //delete
    @DeleteMapping("/{id}")
    public String deleteInfo(@PathVariable int id) {
        return deleteInfo(id);
    }


}
