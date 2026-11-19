package com.example.democlass.modal;

import java.time.LocalDateTime;

public class ClassDTO {
    private Integer id;
    private String grade;
    private String className;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;

    // Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDateTime getDeleteDate() {
        return deleteDate;
    }
    public void setDeleteDate(LocalDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }
}