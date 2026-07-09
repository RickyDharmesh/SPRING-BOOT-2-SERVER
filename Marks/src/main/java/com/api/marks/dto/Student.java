package com.api.marks.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private String email;

    private int phyMark;
    private int mathMark;
    private int chemMark;

    private int cutoff;

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhyMark() {
        return phyMark;
    }

    public void setPhyMark(int phyMark) {
        this.phyMark = phyMark;
    }

    public int getMathMark() {
        return mathMark;
    }

    public void setMathMark(int mathMark) {
        this.mathMark = mathMark;
    }

    public int getChemMark() {
        return chemMark;
    }

    public void setChemMark(int chemMark) {
        this.chemMark = chemMark;
    }

    public int getCutoff() {
        return cutoff;
    }

    public void setCutoff(int cutoff) {
        this.cutoff = cutoff;
    }

    public int getId() {
        return 0;
    }
}