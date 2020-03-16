package com.dgut.test.paper.mapper;

import com.dgut.test.paper.entity.ApiUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiUserMapper {
    @Select("SELECT * FROM api_user WHERE user_name=#{name}")
    ApiUser getApiUserByName(String name) throws DataAccessException;

}
