package com.example.questionPaperGenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {

    @Id
    private String subjectCode;
    private String subjectName;
    private String subjectLecture;

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectLecture() {
        return subjectLecture;
    }

    public void setSubjectLecture(String subjectLecture) {
        this.subjectLecture = subjectLecture;
    }
}
