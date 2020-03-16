package com.dgut.test.paper.mapper;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dgut.test.paper.entity.Course;

import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    /*
    * 获取当前学年的课程信息
    * */
    @Select("SELECT * FROM course1920")
    IPage<Course> getAll(Page<?> page, Integer state);


    /*
     * 获取指定学年的课程信息
     * */
    @Select("SELECT * FROM ${table}")
    List<Course> getAllByTableName(String table) throws DataAccessException;


}
