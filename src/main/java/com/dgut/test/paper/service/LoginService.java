package com.dgut.test.paper.service;


import com.dgut.test.paper.entity.ApiUser;
import com.dgut.test.paper.util.inter.TokenDetail;


public interface LoginService {

    ApiUser loginApiUser(String username);

    String generateToken(ApiUser apiUser);

}
