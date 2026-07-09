package com.api.marks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Marks")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int studentId;

    private int phyMark;
    private int mathMark;
    private int chemMark;
    private int cutoff;

    public Mark() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
