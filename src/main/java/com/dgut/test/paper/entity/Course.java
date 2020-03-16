package com.dgut.test.paper.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    int id;
    String courseCode;
    String courseName;
    String courseType;
    String courseNature;
    String courseExamType;
    float courseCredit;
    String teacherCode;
    String teacherName;
    int xn;
    int xq;
    String courseEnglishName;







}
