package com.example.democlass.modal;

import java.time.LocalDateTime;

public class StudentDTO {
    private Integer id;
    private String number;
    private String name;
    private Integer classId;           // 新增：對應資料表的 class_id
    private String className;
    private String grade;
    private LocalDateTime createDate;  // 新增：建立時間
    private LocalDateTime updateDate;  // 新增：更新時間
    private LocalDateTime deleteDate;  // 新增：刪除時間（軟刪除用）

    // Getters and Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassId() {
        return classId;
    }
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
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