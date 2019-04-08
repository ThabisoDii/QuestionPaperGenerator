package com.example.questionPaperGenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionPaper {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long question_id;
    private int total;
    private String questionExaminer;
    private String subjectCode;// to be changed

    public long getQuestion_id() {
        return question_id;
    }

    public void setId(long question_id) {
        this.question_id = question_id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getQuestionExaminer() {
        return questionExaminer;
    }

    public void setQuestionExaminer(String questionExaminer) {
        this.questionExaminer = questionExaminer;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
}
