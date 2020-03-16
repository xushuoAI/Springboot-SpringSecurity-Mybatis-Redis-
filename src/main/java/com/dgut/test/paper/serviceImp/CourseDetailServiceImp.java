package com.dgut.test.paper.serviceImp;

import com.dgut.test.paper.entity.CourseDetail;
import com.dgut.test.paper.mapper.CourseDetailMapper;
import com.dgut.test.paper.service.CourseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDetailServiceImp implements CourseDetailService {
    @Autowired
    CourseDetailMapper courseDetailMapper;

    @Override
    public List<CourseDetail> getCourseDetailByCourseName(String courseName) {
        try {
            return courseDetailMapper.getDetailByCouName(courseName);
        }catch (DataAccessException e){
            return null;
        }

    }
}
