package com.dgut.test.paper.serviceImp;


import com.dgut.test.paper.entity.ApiUser;
import com.dgut.test.paper.mapper.ApiUserMapper;
import com.dgut.test.paper.service.LoginService;
import com.dgut.test.paper.util.TokenUtils;
import com.dgut.test.paper.util.inter.TokenDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @version V1.0.0
 * @Description
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/10/3 2:12
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private  ApiUserMapper userMapper;
    @Autowired
    private  TokenUtils tokenUtils;

    @Override
    public ApiUser loginApiUser(String username) {
        return userMapper.getApiUserByName(username);
    }


    @Override
    public String generateToken(ApiUser apiUser) {
        return tokenUtils.generateToken(apiUser);
    }
}
