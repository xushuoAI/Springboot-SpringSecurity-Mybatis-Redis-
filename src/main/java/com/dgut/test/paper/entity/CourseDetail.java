package com.dgut.test.paper.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDetail implements Serializable {
    int id;
    String courseCode;
    String courseName;
    String classCode;
    String className;
    String studentCode;
    String studentName;
    int xn;
    int xq;
    //年级
    int grade;
    //成绩
    double score;
    String examPaper;


}
