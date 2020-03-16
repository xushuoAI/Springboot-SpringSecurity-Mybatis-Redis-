package com.dgut.test.paper.controller;

import com.dgut.test.paper.messgae.JsonResult;
import com.dgut.test.paper.service.CourseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDetailController {
    @Autowired
    CourseDetailService service;

    @PostMapping("/courseDetail/{courseName}")
    public JsonResult getCourseDetailByName(@PathVariable("courseName")String courseName){
        if (service.getCourseDetailByCourseName(courseName)!=null){
            return JsonResult.suc(service.getCourseDetailByCourseName(courseName));
        }else {
            return JsonResult.error();
        }



    }



}
