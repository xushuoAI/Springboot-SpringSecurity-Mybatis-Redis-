package com.dgut.test.paper.service;

import com.dgut.test.paper.entity.CourseDetail;

import java.util.List;

public interface CourseDetailService {

    List<CourseDetail> getCourseDetailByCourseName(String courseName);

}
