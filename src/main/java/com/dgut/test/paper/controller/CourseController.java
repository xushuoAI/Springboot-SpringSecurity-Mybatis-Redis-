package com.dgut.test.paper.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dgut.test.paper.entity.Course;
import com.dgut.test.paper.messgae.JsonResult;
import com.dgut.test.paper.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;


    @PostMapping("/courseList")
    public JsonResult getAllCourse(Page<Course> page, Integer state){
        //获取当前学年的课程列表

        return JsonResult.suc(courseService.getAll(page,state));
    }
    @PostMapping("/courseList/{courseTableName}")
    public JsonResult getAllCourseByTable(@PathVariable("courseTableName")String tableName){
        //获取当前学年的课程列表
        if (courseService.getAllCourseByTable(tableName)==null){
            //错误的TableName
            return JsonResult.error();
        }
        return JsonResult.suc(courseService.getAllCourseByTable(tableName));
    }




}
