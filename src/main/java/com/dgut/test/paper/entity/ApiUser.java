package com.dgut.test.paper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiUser implements Serializable {
    private String username;
    private String password;
    private String authorities;
    private int enable;



    public boolean enable() {
        if (this.enable == 1){
            return true;
        }
        return false;
    }

}
