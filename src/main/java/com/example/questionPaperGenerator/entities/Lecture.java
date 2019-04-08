package com.example.questionPaperGenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lecture {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String lectureName;
    private String lectureSurname;
    private String lectureEmail;
    private String subjectCode;
    private String lecturePassword;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLectureSurname() {
        return lectureSurname;
    }

    public void setLectureSurname(String lectureSurname) {
        this.lectureSurname = lectureSurname;
    }

    public String getLectureEmail() {
        return lectureEmail;
    }

    public void setLectureEmail(String lectureEmail) {
        this.lectureEmail = lectureEmail;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getLecturePassword() {
        return lecturePassword;
    }

    public void setLecturePassword(String lecturePassword) {
        this.lecturePassword = lecturePassword;
    }
}
