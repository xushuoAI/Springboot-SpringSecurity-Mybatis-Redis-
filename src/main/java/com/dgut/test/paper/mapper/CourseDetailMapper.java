package com.dgut.test.paper.mapper;


import com.dgut.test.paper.entity.CourseDetail;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDetailMapper {

    @Select("SELECT * FROM ${name}")
    List<CourseDetail> getDetailByCouName(String name) throws DataAccessException;



}
