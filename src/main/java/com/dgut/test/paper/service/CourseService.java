package com.dgut.test.paper.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dgut.test.paper.entity.Course;

import java.util.List;

public interface CourseService {

    public IPage<Course> getAll(Page<Course> page, Integer state);

    List<Course> getAllCourseByTable(String tableName);



}
