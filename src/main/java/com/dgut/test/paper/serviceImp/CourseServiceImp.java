package com.dgut.test.paper.serviceImp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dgut.test.paper.entity.Course;
import com.dgut.test.paper.mapper.CourseMapper;
import com.dgut.test.paper.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImp implements CourseService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    CourseMapper courseMapper;

    @Override
    public IPage<Course> getAll(Page<Course> page, Integer state) {
        return courseMapper.getAll(page,state);
    }

    @Override
    @Cacheable(cacheNames = "course",key = "#tableName")
    public List<Course> getAllCourseByTable(String tableName) {
        logger.info("进入数据库查找数据",this);
        try{
            return courseMapper.getAllByTableName(tableName);
        }catch (DataAccessException e){
            return null;
        }

    }

}
