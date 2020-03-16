package com.dgut.test.paper.controller;

import com.dgut.test.paper.entity.ApiUser;
import com.dgut.test.paper.messgae.JsonResult;
import com.dgut.test.paper.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @Autowired
    private LoginService loginService;




    @GetMapping("/get_token")
    public JsonResult getToken(@RequestParam String username,@RequestParam String password){

        ApiUser apiUser=loginService.loginApiUser(username);
        JsonResult jsonResult=checkApiUser(apiUser,password);
        if (jsonResult!=null){
            return jsonResult;
        }
        String token=loginService.generateToken(apiUser);

        return JsonResult.suc(token);
    }

    private JsonResult checkApiUser(ApiUser apiUser,String password){
        if (apiUser==null){
            return JsonResult.error(434,"账户不存在");
        }else {
            if (apiUser.getEnable()==0){
                return JsonResult.error(452,"账户在黑名单");
            }
            if (!apiUser.getPassword().equals(password)){
                //equals相等返回true
                return JsonResult.error(452,"账户密码错误");

            }

        }
        return null;
    }

}
